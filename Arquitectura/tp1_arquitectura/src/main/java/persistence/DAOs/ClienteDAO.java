package persistence.DAOs;
import entities.Cliente;
import persistence.MySQLconnection;
import persistence.service.Dao;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements Dao<Cliente> {

    private java.sql.Connection  conection;
    private static ClienteDAO instance;

    private ClienteDAO(java.sql.Connection connection) throws Exception {
        this.conection = connection;
    }

    public static ClienteDAO getInstance(java.sql.Connection connection) throws Exception {
        if (instance == null) {
            instance = new ClienteDAO(connection);
        }
        return instance;
    }

    public void crearTabla() throws Exception {
        DatabaseMetaData metaData = this.conection.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "cliente", null);
        if(!tables.next()) {
            PreparedStatement ps = this.conection.prepareStatement("CREATE TABLE cliente(" +
                    "id INT," +
                    "nombre VARCHAR(500)," +
                    "email VARCHAR(150), " +
                    "PRIMARY KEY(id))");
            ps.execute();
            conection.commit();
        }
    }

    @Override
    public void add(Cliente p) throws Exception {
        if(this.getById(p.getId()) == null) {
            PreparedStatement ps = this.conection.prepareStatement("INSERT INTO cliente (id, nombre, email) VALUES (?,?,?)");
            ps.setInt(1, p.getId());
            ps.setString(2,p.getNombre());
            ps.setString(3, p.getEmail());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void update(Cliente p, entities.Cliente pNew) throws Exception {
        if(this.getById(p.getId()) != null) {
            PreparedStatement ps = this.conection.prepareStatement("UPDATE cliente set nombre =?,email=? where id = ?");
            ps.setString(1, pNew.getNombre());
            ps.setString(2, pNew.getEmail());
            ps.setInt(3, p.getId());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void delete(Cliente p) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("DELETE FROM cliente where id = ?");
        ps.setInt(1,p.getId());
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public List<Cliente> getAll() throws Exception {
        List<Cliente> res = new ArrayList<>();
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from cliente");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            entities.Cliente cl = new entities.Cliente();
            cl.setId(rs.getInt("id"));
            cl.setNombre(rs.getString("nombre"));
            cl.setEmail(rs.getString("email"));
            res.add(cl);
        }
        rs.close();
        ps.close();
        conection.commit();
        return res;
    }

    @Override
    public Cliente getById(int id) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from cliente WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Cliente cl = new Cliente(rs.getInt("id"), rs.getString("nombre"), rs.getString("email"));
            ps.close();
            conection.commit();
            return cl;
        }else{
            ps.close();
            conection.commit();
            return null;
        }
    }

    public List<Cliente> getClientsSortedByBilledMore() throws Exception {
        List<Cliente> res = new ArrayList<>();
        PreparedStatement ps = this.conection.prepareStatement("SELECT  c.id , c.nombre ,\n" +
                "       SUM(p.valor * fp.cantidad) AS total_facturado\n" +
                "FROM cliente c\n" +
                "JOIN factura f ON c.id = f.idCliente\n" +
                "JOIN factura_producto fp ON f.idFactura = fp.id_factura\n" +
                "JOIN producto p ON fp.id_producto = p.id\n" +
                "GROUP BY c.id \n" +
                "ORDER BY total_facturado DESC;");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            entities.Cliente cl = new DTOs.ClienteConFacturacion(rs.getInt("id"), rs.getString("nombre"), rs.getDouble("total_facturado"));
            res.add(cl);
        }
        rs.close();
        ps.close();
        conection.commit();
        return res;
    }
}


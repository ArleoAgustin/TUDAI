package persistence.DAOs;

import entities.Producto;
import persistence.MySQLconnection;
import persistence.service.Dao;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO implements Dao<Producto> {

    private java.sql.Connection  conection;
    private static ProductoDAO instance;

    private ProductoDAO(java.sql.Connection  conection) throws Exception {
        this.conection = conection;
    }

    public static ProductoDAO getInstance(java.sql.Connection  conection) throws Exception {
        if (instance == null) {
            instance = new ProductoDAO(conection);
        }
        return instance;
    }

    @Override
    public void crearTabla() throws Exception {
        DatabaseMetaData metaData = conection.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "producto", null);
        if (!tables.next()) {
            PreparedStatement ps = this.conection.prepareStatement("CREATE TABLE producto(" +
                    "id INT," +
                    "nombre VARCHAR(500)," +
                    "valor FLOAT," +
                    "PRIMARY KEY(id))");
            ps.execute();
            conection.commit();
        }
    }

    @Override
    public void add(Producto p) throws Exception {
        if(this.getById(p.getId()) == null) {
            PreparedStatement ps = this.conection.prepareStatement("INSERT INTO producto (id, nombre, valor) VALUES (?,?,?)");
            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setDouble(3, p.getValor());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void update(Producto p, Producto pNew) throws Exception {
        if(this.getById(p.getId()) != null) {
            PreparedStatement ps = this.conection.prepareStatement("UPDATE producto set nombre =?, valor=? where id = ?");
            ps.setString(1, pNew.getNombre());
            ps.setDouble(2, pNew.getValor());
            ps.setInt(3, p.getId());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void delete(Producto p) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("DELETE FROM producto where id = ?");
        ps.setInt(1,p.getId());
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public List<Producto> getAll() throws Exception {
        List<entities.Producto> res = new ArrayList<>();
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from producto");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            res.add(new entities.Producto(rs.getInt("id"),
                                        rs.getString("nombre"),
                                        rs.getDouble("valor")));
        }
        ps.close();
        conection.commit();
        return res;
    }

    @Override
    public Producto getById(int id) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from producto WHERE id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Producto p = new Producto(rs.getInt("id"), rs.getString("nombre"), rs.getDouble("valor"));
            ps.close();
            conection.commit();
            return p;
        }else{
            ps.close();
            conection.commit();
            return null;
        }
    }

    public Producto getMostCollectedProduct() throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("SELECT p.id , p.nombre AS producto_mas_recaudado, \n" +
                "       SUM(fp.cantidad * p.valor) AS total_recaudado\n" +
                "from producto p\n" +
                "inner join factura_producto fp on p.id = fp.id_producto \n" +
                "GROUP by id_producto \n" +
                "ORDER by total_recaudado DESC \n" +
                "limit 1;");
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Producto p = new Producto(rs.getInt("id"), rs.getString("producto_mas_recaudado"), rs.getDouble("total_recaudado"));
            ps.close();
            conection.commit();
            return p;
        }
        else return null;
    }
}

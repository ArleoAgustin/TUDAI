package persistence.DAOs;

import entities.Factura;
import persistence.MySQLconnection;
import persistence.service.Dao;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FacturaDAO implements Dao<Factura> {

    private java.sql.Connection  conection;
    private static FacturaDAO instance;

    private FacturaDAO(java.sql.Connection  conection) throws Exception {
        this.conection = conection;
    }

    public static FacturaDAO getInstance(java.sql.Connection connection) throws Exception {
        if (instance == null) {
            instance = new FacturaDAO(connection);
        }
        return instance;
    }

    @Override
    public void crearTabla() throws Exception {
        DatabaseMetaData metaData = this.conection.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "factura", null);
        if(!tables.next()) {
            PreparedStatement ps = this.conection.prepareStatement("CREATE TABLE factura(" +
                    "idFactura INT," +
                    "idCliente INT," +
                    "PRIMARY KEY(idFactura))");
            ps.execute();
            conection.commit();
        }
    }

    @Override
    public void add(Factura f) throws Exception {
        if (this.getById(f.getIdFactura()) == null) {
            PreparedStatement ps = this.conection.prepareStatement("INSERT INTO factura (idFactura,idCliente) VALUES (?,?)");
            ps.setInt(1, f.getIdFactura());
            ps.setInt(2, f.getIdCliente());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void update(Factura f, Factura fNew) throws Exception {
        if (this.getById(f.getIdFactura()) != null) {
            PreparedStatement ps = this.conection.prepareStatement("UPDATE factura set idFactura =?,idCliente=? where idFactura = ?");
            ps.setInt(1, fNew.getIdFactura());
            ps.setInt(2, fNew.getIdCliente());
            ps.setInt(3, f.getIdFactura());
            ps.executeUpdate();
            ps.close();
            conection.commit();
        }
    }

    @Override
    public void delete(Factura f) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("DELETE FROM factura where idFactura = ?");
        ps.setInt(1,f.getIdFactura());;
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public List<Factura> getAll() throws Exception {
        List res = new ArrayList();
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from factura");
        ResultSet rs = ps.executeQuery();
        while (rs.next()){
            entities.Factura f = new entities.Factura(rs.getInt("idFactura"),rs.getInt("idCliente"));
            res.add(f);
        }
        rs.close();
        ps.close();
        conection.commit();
        return res;
    }

    @Override
    public Factura getById(int id) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from factura WHERE idfactura = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Factura f = new Factura(rs.getInt("idFactura"), rs.getInt("idCliente"));
            ps.close();
            conection.commit();
            return f;
        }else{
            ps.close();
            conection.commit();
            return null;
        }
    }
}

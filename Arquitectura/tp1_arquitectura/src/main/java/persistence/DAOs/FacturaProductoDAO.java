package persistence.DAOs;

import entities.FacturaProducto;
import persistence.MySQLconnection;
import persistence.service.Dao;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

public class FacturaProductoDAO implements Dao<FacturaProducto> {

    private java.sql.Connection  conection;
    private static FacturaProductoDAO instance;

    private FacturaProductoDAO(java.sql.Connection  conection) throws Exception {
        this.conection = conection;
    }

    public static FacturaProductoDAO getInstance(java.sql.Connection connection) throws Exception {
        if (instance == null) {
            instance = new FacturaProductoDAO(connection);
        }
        return instance;
    }

    @Override
    public void crearTabla() throws Exception {
        DatabaseMetaData metaData = this.conection.getMetaData();
        ResultSet tables = metaData.getTables(null, null, "factura_producto", null);
        if(!tables.next()) {
            PreparedStatement ps = this.conection.prepareStatement("CREATE TABLE factura_producto (" +
                    "id_factura INT NOT NULL," +
                    "id_producto INT NOT NULL," +
                    "cantidad INT)" );
            ps.execute();
            conection.commit();
        }
    }

    @Override
    public void add(FacturaProducto fp) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("INSERT INTO factura_producto (id_factura, id_producto, cantidad) VALUES (?,?,?)");
        ps.setInt(1, fp.getIdFactura());
        ps.setInt(2,fp.getIdProducto());
        ps.setInt(3, fp.getCantidad());
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public void update(FacturaProducto fp, FacturaProducto fpNew) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("UPDATE factura_producto set cantidad =?, where id_factura = ? AND id_producto=?");
        ps.setInt(1, fp.getCantidad());
        ps.setInt(2,fp.getIdFactura());
        ps.setInt(3, fp.getIdProducto());
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public void delete(FacturaProducto fp) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("DELETE FROM factura_producto where id_factura = ? AND id_producto=?");
        ps.setInt(1,fp.getIdFactura());
        ps.setInt(2,fp.getIdFactura());
        ps.executeUpdate();
        ps.close();
        conection.commit();
    }

    @Override
    public List<FacturaProducto> getAll() throws Exception {
        return null;
    }

    @Override
    public FacturaProducto getById(int id) throws Exception {
        PreparedStatement ps = this.conection.prepareStatement("SELECT * from factura_producto WHERE id_factura = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            FacturaProducto  fp = new FacturaProducto(rs.getInt("id_producto"), rs.getInt("id_factura"), rs.getInt("cantidad"));
            ps.close();
            conection.commit();
            return fp;
        }else{
            ps.close();
            conection.commit();
            return null;
        }
    }
}

package persistence;

import persistence.DAOs.ClienteDAO;
import persistence.DAOs.FacturaDAO;
import persistence.DAOs.FacturaProductoDAO;
import persistence.DAOs.ProductoDAO;

public class DaoFactory  {

    private java.sql.Connection connection;

    public DaoFactory()  throws Exception  {
        connection = MySQLconnection.getConnection();
    }

    public ClienteDAO getClienteDAO() throws Exception {
        return ClienteDAO.getInstance(connection);
    }

    public FacturaDAO  getFacturaDAO() throws Exception {
        return FacturaDAO.getInstance(connection);
    }

    public ProductoDAO getProductoDAO() throws Exception {
        return ProductoDAO.getInstance(connection);
    }

    public FacturaProductoDAO getFacturaProductoDAO() throws Exception {
        return FacturaProductoDAO.getInstance(connection);
    }


}

import migration.java.ReadCSV;
import persistence.DAOs.ClienteDAO;
import persistence.DAOs.FacturaDAO;
import persistence.DAOs.FacturaProductoDAO;
import persistence.DAOs.ProductoDAO;
import persistence.DaoFactory;
public class Main {

    public static void main(String[] args) throws Exception {

        DaoFactory factory = new DaoFactory();
        ReadCSV cargador = new ReadCSV();
        ClienteDAO client = factory.getClienteDAO();
        ProductoDAO product = factory.getProductoDAO();
        FacturaDAO factura = factory.getFacturaDAO();
        FacturaProductoDAO facturaProducto = factory.getFacturaProductoDAO();

        client.crearTabla();
        product.crearTabla();
        factura.crearTabla();
        facturaProducto.crearTabla();


        cargador.readDatesClientes();
        cargador.readDatesProductos();
        cargador.readDatesFacturas();
        cargador.readDatesFacturas_productos();

        System.out.println(facturaProducto.getById(1));


        System.out.println(factura.getById(99));


        System.out.println(product.getById(9));System.out.println(product.getById(1));
        System.out.println(product.getMostCollectedProduct());


        System.out.println(client.getById(2));

        System.out.println(client.getById(1));System.out.println(client.getById(99));
        System.out.println(client.getClientsSortedByBilledMore());
        client.getAll();

    }
}

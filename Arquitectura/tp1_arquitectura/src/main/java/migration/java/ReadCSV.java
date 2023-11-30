package migration.java;

import entities.Cliente;
import entities.Factura;
import entities.FacturaProducto;
import entities.Producto;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import persistence.DAOs.ClienteDAO;
import persistence.DAOs.FacturaDAO;
import persistence.DAOs.FacturaProductoDAO;
import persistence.DAOs.ProductoDAO;
import persistence.DaoFactory;

import java.io.FileReader;

public class ReadCSV {

    public ReadCSV() throws Exception {}

    private String fileClientes = "src/main/java/migration/CSVs/clientes.csv";
    private String fileFacturas = "src/main/java/migration/CSVs/facturas.csv";
    private String fileProductos = "src/main/java/migration/CSVs/productos.csv";
    private String fileFacturas_Productos = "src/main/java/migration/CSVs/facturas-productos.csv";
    DaoFactory factory = new DaoFactory();

    public void readDatesClientes() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader(fileClientes));
        ClienteDAO client = factory.getClienteDAO();

        for(CSVRecord row: parser) {
            client.add(new Cliente(Integer.parseInt(row.get("idCliente")),row.get("nombre"),row.get("email")));
        }
    }

    public void readDatesProductos() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader(fileProductos));

        ProductoDAO product = factory.getProductoDAO();

        for(CSVRecord row: parser) {
            product.add(new Producto(Integer.parseInt(row.get("idProducto")),row.get("nombre"),Double.parseDouble(row.get("valor"))));
        }
    }

    public void readDatesFacturas() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader(fileFacturas));

        FacturaDAO factura = factory.getFacturaDAO();

        for(CSVRecord row: parser) {
            factura.add(new Factura(Integer.parseInt(row.get("idFactura")),Integer.parseInt(row.get("idCliente"))));
        }
    }

    public void readDatesFacturas_productos() throws Exception {
        CSVParser parser = CSVFormat.DEFAULT.withHeader().parse(new FileReader(fileFacturas_Productos));

        FacturaProductoDAO facProducto = factory.getFacturaProductoDAO();

        for(CSVRecord row: parser) {
            facProducto.add(new FacturaProducto(Integer.parseInt(row.get("idFactura")), Integer.parseInt(row.get("idProducto")), Integer.parseInt(row.get("cantidad"))));
        }
    }
}
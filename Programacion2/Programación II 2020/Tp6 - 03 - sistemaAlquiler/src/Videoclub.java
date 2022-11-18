import java.util.ArrayList;

public class Videoclub {

	private ArrayList<ProductoAlquilable> productos;
	private ArrayList<Alquiler> productosAlquilados;
	private ArrayList<Cliente> clientes;
	
	public Videoclub() {
		productos = new ArrayList<ProductoAlquilable>();
		productosAlquilados =  new ArrayList<Alquiler>();
	}
	
	public void alquilarProducto(ProductoAlquilable producto, String fechaDevolucion, Cliente cliente) {
		if (producto.sePuedeAlquilar()) {
			productos.remove(producto);
			producto.AlquilarProducto();
			Alquiler productoAlquilado = new Alquiler(producto, fechaDevolucion, cliente.getNombre());
			productosAlquilados.add(productoAlquilado);
		}
	}
	
	public void deolverProductos(Alquiler productoAlquilado) {
		productosAlquilados.remove(productoAlquilado);
		ProductoAlquilable producto = productoAlquilado.getProducto();
		productoAlquilado.setProducto(null);
		productos.add(producto);
		producto.devolveProducto();
	}
	
	public ArrayList<Alquiler> encontrarProductoSinDevolucion() {
		ArrayList<Alquiler> productoSinDevolucion = new ArrayList<Alquiler>();
		for (Alquiler productoAlquilado : productosAlquilados) {
			if (productoAlquilado.productoDevuelto()) {
				productoSinDevolucion.add(productoAlquilado);
			}
		}
		return productoSinDevolucion;
	}
	
	public ArrayList<String> encontrarClientesSinDevolverProducto() {
		ArrayList<String> clientesSinDevolucion = new ArrayList<String>();
		for (Cliente cliente : clientes) {
			if (cliente.faltaDevolverProducto()) {
				clientesSinDevolucion.add(cliente.getNombre());
			}
		}
		return clientesSinDevolucion;
	}
	
	public void addProducto(ProductoAlquilable p) {
		productos.add(p);
	}
}

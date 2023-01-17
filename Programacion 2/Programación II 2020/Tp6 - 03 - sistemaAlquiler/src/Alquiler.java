import java.time.*;

public class Alquiler {
	
	private ProductoAlquilable producto;
	private LocalDate fechaDevolucion;
	private String cliente;
	
	public Alquiler(ProductoAlquilable producto, String fechaDevolucion,String cliente) {
		this.producto = producto;
		this.fechaDevolucion = LocalDate.parse(fechaDevolucion);
		this.cliente = cliente;
	}
	
	public boolean productoDevuelto() {
		LocalDate hoy = LocalDate.now();
		return fechaDevolucion.isBefore(hoy);
	}

	public ProductoAlquilable getProducto() {
		return producto;
	}

	public void setProducto(ProductoAlquilable producto) {
		this.producto = producto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
}

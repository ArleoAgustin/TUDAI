import java.util.ArrayList;


public class Cliente {
	
	private String nombre;
	private ArrayList<Alquiler> productosAlquilados;
	
	public Cliente(String nombre) {
		this.nombre = nombre;
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
	
	public boolean faltaDevolverProducto() {
		for (Alquiler productoAlquilado : productosAlquilados) {
			if (productoAlquilado.productoDevuelto()) {
				return true;
			}
		}
		return false;
	}
	
	public void addProductoAlquilado(Alquiler a) {
		productosAlquilados.add(a);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

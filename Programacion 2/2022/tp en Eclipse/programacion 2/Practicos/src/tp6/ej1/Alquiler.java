package tp6.ej1;

import java.time.LocalDate;

public class Alquiler {
	
	private Item producto;
	private LocalDate fechaDevolucion;
	private Cliente cliente;
	
	public Alquiler(Item producto, LocalDate fechaDevolucion, Cliente cliente) {
		
		this.producto = producto;
		this.fechaDevolucion = fechaDevolucion;
		this.cliente = cliente;
		cliente.addAlquiler(this);
		producto.alquilarItem();
	}

	public Item getProducto() {
		return producto;
	}
	
	public boolean productoDevuelto() {
		LocalDate hoy = LocalDate.now();
		return fechaDevolucion.isBefore(hoy);
	}

	public void setProducto(Item producto) {
		this.producto = producto;
	}

	public LocalDate getfechaDevolucion() {
		return fechaDevolucion;
	}


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
}

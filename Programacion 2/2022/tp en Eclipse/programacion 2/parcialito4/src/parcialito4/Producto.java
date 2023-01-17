package parcialito4;

import java.util.ArrayList;

public class Producto {
	
	private String nombre, descripcion;
	private double precio;
	private ArrayList<String> componentes;
	
	
	
	
	public Producto(String nombre, String descripcion, double precio) {
		
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.componentes = new ArrayList<>();
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}




	public double getPrecio() {
		return precio;
	}




	public void setPrecio(double precio) {
		this.precio = precio;
	}




	public boolean contieneComponente(String c) {
		
		return componentes.contains(c);
		
	}

}

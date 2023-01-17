package recuperatorio2021;

import java.util.ArrayList;

public abstract class Elemento {
	
	private String nombre;

	public Elemento(String nombre) {this.nombre = nombre;}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract double getPeso();
	public abstract double getPrecio();
	public abstract ArrayList<String> getCategorias();

}

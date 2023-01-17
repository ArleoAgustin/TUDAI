package saltarin;

import java.util.ArrayList;

import saltarin.filtros.Filtro;

public abstract class Elemento {
	
	private String nombre;
	
	public Elemento(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getVolumen();
	
	public abstract String getMarca();
	
	public abstract int getPrecio();
	
	public abstract int getCantidadProductos();

	public abstract ArrayList<Elemento> buscar(Filtro filtro);
	
	public abstract Elemento copiar(); 
	
	public abstract Elemento copiar(Filtro filtroTematica); 

	public String toString() {
		return this.nombre;
	}
	
}

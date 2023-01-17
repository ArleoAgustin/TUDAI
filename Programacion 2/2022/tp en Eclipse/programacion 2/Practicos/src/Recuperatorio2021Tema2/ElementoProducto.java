package Recuperatorio2021Tema2;

import java.util.ArrayList;

import Recuperatorio2021Tema2.Criterio.Criterio;

public abstract class ElementoProducto {
	
	private String nombre;
	
	
	
	public ElementoProducto(String nombre) {
		super();
		this.setNombre(nombre);
	}
	public abstract double getPrecio();
	public abstract double getPeso();
	public abstract ArrayList<String> getCategorias();
	public abstract int cantProductos();
	public abstract Producto productoConMenorPeso();
	
	public abstract ArrayList<ElementoProducto> buscar(Criterio c);
	
	
	public abstract ElementoProducto copiar(Criterio c);
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

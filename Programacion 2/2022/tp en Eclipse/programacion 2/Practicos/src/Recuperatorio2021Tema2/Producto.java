package Recuperatorio2021Tema2;

import java.util.ArrayList;

import Recuperatorio2021Tema2.Criterio.Criterio;

public class Producto extends ElementoProducto{

	private ArrayList<String> categorias;
	private double peso, precio;
	
	
	
	public Producto(double peso, double precio, String nombre) {
		super(nombre);
		this.categorias = new ArrayList<>();
		this.peso = peso;
		this.precio = precio;
	}
	@Override
	public double getPrecio() {
		// TODO Auto-generated method stub
		return precio;
	}
	@Override
	public double getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}
	@Override
	public ArrayList<String> getCategorias() {
		// TODO Auto-generated method stub
		return new ArrayList<>(categorias);
	}
	@Override
	public int cantProductos() {
		
		return 1;
	}
	@Override
	public Producto productoConMenorPeso() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public ArrayList<ElementoProducto> buscar(Criterio c) {
	
		ArrayList<ElementoProducto> res = new ArrayList<>();
		if(c.cumple(this))
			res.add(this);
		return res;
	}
	@Override
	public ElementoProducto copiar(Criterio c) {
		
		if(c.cumple(this))
			return new Producto(this.peso, this.precio, this.getNombre());
		else
		return null;
	}
	
	
}

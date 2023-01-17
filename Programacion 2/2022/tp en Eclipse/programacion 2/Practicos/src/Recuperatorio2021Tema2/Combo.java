package Recuperatorio2021Tema2;

import java.util.ArrayList;

import Recuperatorio2021Tema2.Criterio.Criterio;
import Recuperatorio2021Tema2.Criterio.CriterioDefault;

public class Combo extends ElementoProducto {
	
	private final double descuento = 1.4;
	
	protected ArrayList<ElementoProducto> productos;
	
	private Criterio condicion;
	
	public Combo(String nombre, Criterio c) {
		super(nombre);
		this.productos = new ArrayList<>();
		this.condicion = c;
	}

	
	
	public Criterio getCondicion() {
		return condicion;
	}



	public void setCondicion(Criterio condicion) {
		this.condicion = condicion;
	}



	public void addProducto(ElementoProducto p) {
		
		if(condicion.cumple(p))
			productos.add(p);
	}
	

	@Override
	public double getPrecio() {
		
		double aux = 0;
		double llevarCuenta = 0;
		for(ElementoProducto e: this.productos) {
			aux+= e.getPrecio();
			llevarCuenta += e.getPrecio() * this.descuento;
		}
		if(llevarCuenta < aux /2) {
			return llevarCuenta;
		}
		else
			return aux/2;
	}

	@Override
	public double getPeso() {

		double aux = 0;
		for(ElementoProducto e: this.productos) {
			aux+= e.getPeso();
		}
		return aux;
	}

	@Override
	public ArrayList<String> getCategorias() {
		
		ArrayList<String> resultado = new ArrayList<>();
		
		
		for(ElementoProducto e: this.productos) {
			
			ArrayList<String> aux = e.getCategorias();
			
			for(String s: aux) {
				if(!resultado.contains(s)){
					resultado.add(s);
				}
			}
			
		}
		return resultado;
	}



	@Override
	public int cantProductos() {
	
		int aux = 0;
		
		for(ElementoProducto e: this.productos) {
			aux+= e.cantProductos();
	}
		return aux;
	}
	
	public Producto productoConMenorPeso() {
		
		double menorPeso = 999999;
		Producto prod = null;
		
		for(ElementoProducto e: this.productos) {
			Producto pAux = e.productoConMenorPeso();
			
			if(pAux.getPeso() < menorPeso) {
				menorPeso = pAux.getPeso();
				prod = pAux;
				
			}
		}
		return prod;
	}



	@Override
	public ArrayList<ElementoProducto> buscar(Criterio c) {
		
		ArrayList<ElementoProducto> res = new ArrayList<>();
		
		if(c.cumple(this)) {
			res.add(this);
		}
		else {
		
		for(ElementoProducto e: this.productos) {
			
			ArrayList<ElementoProducto> aux = e.buscar(c);
			
			res.addAll(aux);
		}
	
		}
		return res;
	}



	public ArrayList<ElementoProducto> getProductos() {
		return new ArrayList<>(productos);
	}



	public void setProductos(ElementoProducto p) {
		this.productos.add(p);
	}

	
	public boolean estaVacio() {
		return this.productos.size() > 0;
	}

	@Override
	public ElementoProducto copiar(Criterio c) {
		
		Combo retorno = null;
		if(c.cumple(this)) {
			retorno = new Combo(this.getNombre(), this.getCondicion());
		
		
		for(ElementoProducto e: this.productos) {
			ElementoProducto aux = e.copiar(c);
			if(aux != null)
				retorno.addProducto(aux);
		}
		if(!retorno.estaVacio())
			return retorno;
		}
		return retorno;
	}
	
	

/*

	@Override
	public ElementoProducto copiar(Criterio c) {

		ElementoProducto retorno = null;
		
		for(ElementoProducto e: this.productos) {
			 rete.copiar(c);
		}
		return null;
	}
*/
}

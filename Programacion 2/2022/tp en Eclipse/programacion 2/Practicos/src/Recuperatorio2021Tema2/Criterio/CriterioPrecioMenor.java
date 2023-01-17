package Recuperatorio2021Tema2.Criterio;

import Recuperatorio2021Tema2.ElementoProducto;

public class CriterioPrecioMenor extends Criterio {
	
	private double precio;
	
	
	
	public CriterioPrecioMenor(double p) {
		super();
		this.precio = p;
	}


	@Override
	public boolean cumple(ElementoProducto p) {
		return p.getPrecio() < precio;
	}

}

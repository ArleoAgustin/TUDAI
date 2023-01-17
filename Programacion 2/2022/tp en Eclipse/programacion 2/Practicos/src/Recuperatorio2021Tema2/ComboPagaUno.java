package Recuperatorio2021Tema2;

import Recuperatorio2021Tema2.Criterio.Criterio;

public class ComboPagaUno extends Combo {



	public ComboPagaUno(String nombre, Criterio c) {
		super(nombre, c);
		// TODO Auto-generated constructor stub
	}

	public double getPrecio() {
		
		double precioMayor = 0;
		
		for(ElementoProducto e: super.getProductos()) {
			if(e.getPrecio() > precioMayor)
				precioMayor = e.getPrecio();
		}
		return precioMayor;
	}
	
}

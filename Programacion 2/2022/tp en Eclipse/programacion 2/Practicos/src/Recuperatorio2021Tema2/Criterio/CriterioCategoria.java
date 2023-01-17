package Recuperatorio2021Tema2.Criterio;

import Recuperatorio2021Tema2.ElementoProducto;

public class CriterioCategoria extends Criterio {

	private String s;
	
	
	
	public CriterioCategoria(String s) {
		super();
		this.s = s;
	}


	@Override
	public boolean cumple(ElementoProducto p) {
		
		return p.getCategorias().contains(s);
		
	}

}

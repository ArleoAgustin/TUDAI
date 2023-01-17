package Recuperatorio2021Tema2.Criterio;

import Recuperatorio2021Tema2.ElementoProducto;

public class CriterioNot extends Criterio {

	private Criterio c;
	
	
	
	public CriterioNot(Criterio c) {
		super();
		this.c = c;
	}



	@Override
	public boolean cumple(ElementoProducto p) {
		return !c.cumple(p);
	}

}

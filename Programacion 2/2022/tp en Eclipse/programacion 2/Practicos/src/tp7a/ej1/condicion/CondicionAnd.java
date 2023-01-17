package tp7a.ej1.condicion;

import tp7a.ej1.Producto;

public class CondicionAnd extends Condicion {
	
	private Condicion c1;
	private Condicion c2;
	
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		
		this.c1 = c1;
		this.c2 = c2;
	}


	@Override
	public boolean cumple(Producto p) {
		
		return c1.cumple(p) && c2.cumple(p);
		
	}

}
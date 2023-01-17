package parcialito4.Condiciones;

import parcialito4.Producto;

public class CondicionAnd extends Condicion {

	private Condicion c1;
	private Condicion c2;
	
	@Override
	public boolean cumple(Producto p) {
		
		return c1.cumple(p) && c2.cumple(p);
	}

}

package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionAnd extends Condicion {
	
	private Condicion c1, c2;
	
	
	
	public CondicionAnd(Condicion c1, Condicion c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public boolean cumple(Documento a) {
		
		return c1.cumple(a) && c2.cumple(a);
	}

}

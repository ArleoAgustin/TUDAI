package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionNot extends Condicion {
	
	private Condicion c;
	
	
	
	public CondicionNot(Condicion c) {
		super();
		this.c = c;
	}



	@Override
	public boolean cumple(Documento a) {
		return !c.cumple(a);
	}

}

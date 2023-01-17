package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionAutor extends Condicion {
	
	private String s;
	
	
	
	public CondicionAutor(String s) {
		super();
		this.s = s;
	}



	@Override
	public boolean cumple(Documento a) {
		return a.contieneAutor(s);

	}

}

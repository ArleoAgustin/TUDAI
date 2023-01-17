package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionContenidoPalabraClave extends Condicion {

private String s;
	
	
	
	public CondicionContenidoPalabraClave(String s) {
		super();
		this.s = s;
	}



	@Override
	public boolean cumple(Documento a) {
		return a.getContenido().contains(s);

	}

}

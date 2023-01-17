package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionMismoTitulo extends Condicion {
	
	private String t;
	
	
	public CondicionMismoTitulo(String t) {
		
		this.t = t;
	}


	@Override
	public boolean cumple(Documento a) {
		
		return a.getTitulo().toLowerCase().equals(t.toLowerCase());
		
	}

}

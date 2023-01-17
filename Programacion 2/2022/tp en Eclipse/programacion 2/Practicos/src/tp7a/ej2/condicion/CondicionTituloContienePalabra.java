package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionTituloContienePalabra extends Condicion {
	
	private String t;
	
	
	public CondicionTituloContienePalabra(String t) {
		
		this.t = t;
	}
	
	@Override
	public boolean cumple(Documento a) {
		
		return a.getTitulo().toLowerCase().contains(t.toLowerCase());
	}

}

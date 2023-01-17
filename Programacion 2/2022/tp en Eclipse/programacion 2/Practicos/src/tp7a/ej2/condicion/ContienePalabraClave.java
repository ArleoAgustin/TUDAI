package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class ContienePalabraClave extends Condicion {
	
	private String p;
	
	
	
	public ContienePalabraClave(String p) {
		this.p = p;
	}



	@Override
	public boolean cumple(Documento a) {
	
		return a.contiene(p);
	}

}

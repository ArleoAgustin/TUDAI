package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class FiltroClasificacion extends Filtro {
	
	private String s;
	
	
	public FiltroClasificacion(String s) {
		super();
		this.s = s;
	}


	@Override
	public boolean cumple(Planta p) {
		return p.getClasificacion().toLowerCase().contains(s.toLowerCase());
		
	}

}

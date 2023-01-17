package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class FiltroNombreCientifico extends Filtro {
	
	private String s;
	
	
	public FiltroNombreCientifico(String s) {
		super();
		this.s = s;
	}


	@Override
	public boolean cumple(Planta p) {
		return this.s.toLowerCase().equals(p.getNombre_cientifico().toLowerCase());
		
	}

}

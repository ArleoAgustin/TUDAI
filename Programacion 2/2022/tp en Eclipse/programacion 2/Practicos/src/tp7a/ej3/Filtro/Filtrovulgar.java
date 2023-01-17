package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class Filtrovulgar extends Filtro {

	private String s;
	
	
	
	public Filtrovulgar(String s) {
		super();
		this.s = s;
	}


	@Override
	public boolean cumple(Planta p) {
		return p.getNombresVulgares().toLowerCase().contains(s.toLowerCase());
	}

}

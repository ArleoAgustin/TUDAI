package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class FiltroNivelSolSuperior extends Filtro {

	private int nivel;
	
	
	
	public FiltroNivelSolSuperior(int nivel) {
		super();
		this.nivel = nivel;
	}



	@Override
	public boolean cumple(Planta p) {
		
		return p.getSol() > nivel;
	}

}

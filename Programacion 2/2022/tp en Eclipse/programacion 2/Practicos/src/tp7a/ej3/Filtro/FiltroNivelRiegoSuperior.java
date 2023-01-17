package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class FiltroNivelRiegoSuperior extends Filtro {
	
	private int nivel;
	
	
	public FiltroNivelRiegoSuperior(int nivel) {
		super();
		this.nivel = nivel;
	}


	@Override
	public boolean cumple(Planta p) {
		return p.getnivelDeRiego() > nivel;
	}

}

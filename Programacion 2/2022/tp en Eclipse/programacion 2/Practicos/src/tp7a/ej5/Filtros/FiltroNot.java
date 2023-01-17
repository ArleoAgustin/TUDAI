package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class FiltroNot extends Filtro {
	
	private Filtro f;
	
	
	
	public FiltroNot(Filtro f) {
		this.f = f;
	}

	@Override
	public boolean cumple(Pelicula p) {
		return !f.cumple(p);
	}

}

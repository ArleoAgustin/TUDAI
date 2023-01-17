package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class FiltroAnd extends Filtro {
	
	private Filtro f1;
	private Filtro f2;
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		
		this.f1 = f1;
		this.f2 = f2;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return f1.cumple(p) && f2.cumple(p);
	}

}

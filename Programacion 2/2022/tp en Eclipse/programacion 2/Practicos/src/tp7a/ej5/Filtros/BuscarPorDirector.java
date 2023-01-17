package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class BuscarPorDirector extends Filtro {
	
private String s;
	
	
	
	public BuscarPorDirector(String s) {
		this.s = s;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return s.toLowerCase().equals(p.getDirector().toLowerCase());
	}

}

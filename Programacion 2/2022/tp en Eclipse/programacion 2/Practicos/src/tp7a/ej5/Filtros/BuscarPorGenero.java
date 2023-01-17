package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class BuscarPorGenero extends Filtro {
	
	private String s;
	
	
	
	public BuscarPorGenero(String s) {
		this.s = s;
	}
	
	@Override
	public boolean cumple(Pelicula p) {
		return p.contieneGenero(s);
	}

}

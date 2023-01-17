package tp7a.ej5.Filtros;

import tp7a.ej5.Pelicula;

public class BuscarPorTitulo extends Filtro {
	
	private String s;
	
	
	
	public BuscarPorTitulo(String s) {
		this.s = s;
	}


	@Override
	public boolean cumple(Pelicula p) {
		return s.toLowerCase().equals(p.getTitulo().toLowerCase());
		
	}

}

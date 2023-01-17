package tp7a.ej5;

import java.util.ArrayList;

import tp7a.ej5.Filtros.Filtro;

public class Plataforma {
	
	private ArrayList<Pelicula> catalogo;
	private Filtro rentabilidad;


	public Plataforma() {
		
		this.catalogo = new ArrayList<>();
	}
	
	
	public boolean cumple(Pelicula p) {
		
		return rentabilidad.cumple(p);
	}

	public ArrayList<Pelicula> getCatalogo() {
		return new ArrayList<>(catalogo);
	}

	public void setCatalogo(Pelicula p) {
		this.catalogo.add(p);
	}
	
	public ArrayList<Pelicula> buscarPeliculas(Filtro c){
		
		ArrayList<Pelicula> resultado = new ArrayList<>();
		
		for(Pelicula p: catalogo) {
			if(c.cumple(p))
				resultado.add(p);
		}
		return resultado;
	}
	
	
}

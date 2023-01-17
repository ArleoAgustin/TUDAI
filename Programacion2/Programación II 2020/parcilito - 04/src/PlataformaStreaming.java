import java.util.ArrayList;

public class PlataformaStreaming {
	private ArrayList<Pelicula> peliculas;
	private Criterio citerio;
	
	public PlataformaStreaming() {
		peliculas =  new ArrayList<Pelicula>();
	}
	
	public void addPelicula(Pelicula p) {
		peliculas.add(p);
	}
	
	public ArrayList<Pelicula> buscarPelicula(Criterio cumple) {
		ArrayList<Pelicula> retorno = new ArrayList<Pelicula>();
		for (Pelicula pelicula : peliculas) {
			if (cumple.cumple(pelicula)) {
				retorno.add(pelicula);
			}
		}
		return retorno;
	}

	public boolean encontrerPeliculasRentables(Pelicula p) {
		return citerio.cumple(p);
	}

	public void setCriterio(Criterio cumple) {
		this.citerio = cumple;
	}
}

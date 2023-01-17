
public class CriterioGenero extends Criterio{
	private String genero;
	public CriterioGenero(String genero) {
		this.genero = genero;
	}
	
	public boolean cumple(Pelicula p) {
		return p.tenesGenero(genero);
	}
 	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}

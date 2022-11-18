public class CriterioPorDirector extends Criterio{
	private String director;
	public CriterioPorDirector(String director) {
		this.director = director;
	}
	public boolean cumple(Pelicula p) {
		return p.getDirector() == director;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
}

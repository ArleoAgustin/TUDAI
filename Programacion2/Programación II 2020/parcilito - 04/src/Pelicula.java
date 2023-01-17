import java.util.ArrayList;


public class Pelicula {
	private String titulo;
	private String sinopsis;
	private ArrayList<String> generos;
	private String director;
	private ArrayList<String> actores;
	private int anoEstreno;
	private int duracion;
	private int edadMinima;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getActores() {
		return actores;
	}
	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}
	public int getAnoEstreno() {
		return anoEstreno;
	}
	public void setAnoEstreno(int anoEstreno) {
		this.anoEstreno = anoEstreno;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public boolean tenesGenero(String genero) {
		if (generos.contains(genero)) {
			return true;
		} else {
			return false;
		}
	}
	public boolean tenesActor(String actor) {
		if (actores.contains(actor)) {
			return true;
		} else {
			return false;
		}
	}
}

package tp7a.ej5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pelicula {
	
	private String titulo, sipnosis, director;
	private ArrayList<String> generos;
	private ArrayList<String> actores;
	private LocalDate fechaDeEstreno;
	private int duracion, edadMinima;
	
	public Pelicula(String titulo, String sipnosis, String director, 
			LocalDate fechaDeEstreno, int duracion, int edadMinima) {
		
		this.titulo = titulo;
		this.sipnosis = sipnosis;
		this.director = director;
		this.generos = new ArrayList<>();
		this.actores = new ArrayList<>();
		this.fechaDeEstreno = fechaDeEstreno;
		this.duracion = duracion;
		this.edadMinima = edadMinima;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSipnosis() {
		return sipnosis;
	}
	public void setSipnosis(String sipnosis) {
		this.sipnosis = sipnosis;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public ArrayList<String> getGeneros() {
		return generos;
	}
	public void setGeneros(ArrayList<String> generos) {
		this.generos = generos;
	}
	public ArrayList<String> getActores() {
		return actores;
	}
	public void setActores(ArrayList<String> actores) {
		this.actores = actores;
	}
	public LocalDate getFechaDeEstreno() {
		return fechaDeEstreno;
	}
	public void setFechaDeEstreno(LocalDate fechaDeEstreno) {
		this.fechaDeEstreno = fechaDeEstreno;
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
	
	
	public boolean contieneGenero(String s) {
		
		return this.generos.contains(s);
	}
	
	
}

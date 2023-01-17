package tp2.ej1;

import java.util.ArrayList;

public class Serie {
	
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	private ArrayList <Temporada> temporadas;
	
	
	
	public Serie(String titulo, String descripcion, String creador, String genero) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.creador = creador;
		this.genero = genero;
	}

	
	public	ArrayList<Episodio> episodiosVistosPorTemporada(int nroTemporada){
		
		if(nroTemporada >= 0 && nroTemporada <= this.temporadas.size()) 
			return this.temporadas.get(nroTemporada).episodiosVistos();
		else
			return null;
	}
	
	
	public double promedioCalificacionXTemporada(int nroTemporada) {
		
		return this.temporadas.get(nroTemporada).promedioCalificaciones();
	}
	
	
	public double promedioCalificacionSerie() {
		
		double promedioTotal =0;
		
		for(Temporada t: temporadas) {
			
			promedioTotal += t.promedioCalificaciones();
			
		}
		return promedioTotal / temporadas.size();
	}
	
	
	public boolean seVieronTodosLosEpisodios() {
		
		for(Temporada t: temporadas) {
			
			if(!t.seVieronTodosEpisodios());
				return false;
		}
		return true;
	}
	
		
	public	ArrayList totalEpisodiosVistos(){
	
		ArrayList<ArrayList> epVistos = new ArrayList<>();
	
		for(Temporada t: temporadas) {
			
			epVistos.add(t.episodiosVistos());
		}
		
		if(!epVistos.isEmpty())
			return epVistos;
		else
			return null;
	}
	
	

	public String getTitulo() {
		return titulo;
	}
	
	

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	

	public String getDescripcion() {
		return descripcion;
	}
	
	

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

	public String getCreador() {
		return creador;
	}

	
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	

	public String getGenero() {
		return genero;
	}
	
	

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

	public ArrayList<Temporada> getTemporadas() {
		return temporadas;
	}
	
	

	public void setTemporadas(ArrayList<Temporada> temporadas) {
		
		this.temporadas = temporadas;
	}
	
	
}
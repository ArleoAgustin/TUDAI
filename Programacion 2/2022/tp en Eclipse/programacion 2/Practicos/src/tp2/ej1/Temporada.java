package tp2.ej1;

import java.util.ArrayList;

public class Temporada {
	
	private ArrayList<Episodio> episodios = new ArrayList<Episodio>();
	

	public Temporada() {

	}

	
	public void addEpisodio(Episodio e) {
		
		this.episodios.add(e);
	}

	
	public ArrayList<Episodio> episodiosVistos(){
		
		ArrayList<Episodio> episodiosVistos = new ArrayList<Episodio>();
		
		for(Episodio e: episodios) {
			
			if(e.getSeVio())
				episodiosVistos.add(e);
			
		}
		return episodiosVistos;
	}

	
	public double promedioCalificaciones() {
		
		double promedio = 0;
		
		for(Episodio e: episodios) {
			if(e.getSeVio())
				promedio += e.getCalificacion();
		}
		return promedio / this.episodios.size();
	}
	
	
	public boolean seVieronTodosEpisodios() {
		
		for(Episodio e: episodios) {
			
			if(!e.getSeVio())
				return false;
		}
		return true;
	}


}
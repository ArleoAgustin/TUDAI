import java.util.ArrayList;

class Temporada {

	private int numeroTemporada;
	private int cantEpisodios;
	private ArrayList<Episodio> episodios = new ArrayList<Episodio>();
	private Episodio episodio1;
	private Episodio episodio2;
	private Episodio episodio3;
	private Episodio episodio4;
	private Episodio episodio5;
	private Episodio episodio6;
	private Episodio episodio7;
	private Episodio episodio8;
	private Episodio episodio9;
	private Episodio episodio10;
	
	public Temporada (int numeroDeTemporadas){
		numeroTemporada = numeroDeTemporadas;
		cantEpisodios = (int) ((Math.random()*10)+1);
		episodio1 = new Episodio(); 
		episodio2 = new Episodio(); 
		episodio3 = new Episodio(); 
		episodio4 = new Episodio(); 
		episodio5 = new Episodio(); 
		episodio6 = new Episodio(); 
		episodio7 = new Episodio(); 
		episodio8 = new Episodio(); 
		episodio9 = new Episodio(); 
		episodio10 = new Episodio(); 
		anadirEpisodios (cantEpisodios);
		
	}


	
	private void anadirEpisodios (int cantEpisodios){
		episodios.clear();
		episodios.add(episodio1);
		episodios.add(episodio2);
		episodios.add(episodio3);
		episodios.add(episodio4);
		episodios.add(episodio5);
		episodios.add(episodio6);
		episodios.add(episodio7);
		episodios.add(episodio8);
		episodios.add(episodio9);
		episodios.add(episodio10);
		for (int i = cantEpisodios; i < episodios.size(); i++) {
			episodios.remove(i);
		}
	}
	
	public int obtenerEpisodiosVistos() {
		int i = 0;
		for (Episodio episodio : episodios) {
			if (episodio.isVisto() == true) {
				i++;
			}
		}
		return i;
	}
	
	public boolean vistoCompleta() {
		float totalCap = 0;
		float totalVistos =  0;
		for (Episodio episodio : episodios) {
			if (episodio.isVisto() == true) {
				totalVistos++;
			}
			totalCap++;
		}
		if (totalVistos == totalCap){
			return true;
		} else {
			return false;
		}
	}

	public float darPromedioCapitulos() {
		float total = 0;
		float totalPuntuacion =  0;
		for (Episodio episodio : episodios) {
			if (episodio.isVisto() == true) {
				totalPuntuacion += episodio.getCalificacion();
				total++;
			}
		}
		return (totalPuntuacion / total);
	}
	
	public void dameDatos() {
		System.out.println("\n\nDatos de la temporada " + numeroTemporada+": "
				+ "\nTotal de capitulos vistos: " + obtenerEpisodiosVistos()
				+ ": \nPromedio de puntucaión por capitulos vistos: " + darPromedioCapitulos()
				+ "\nSe vio completa: " + vistoCompleta());
	}
	
	public void dameDatosEpisodios() {
		System.out.println("\n\nLista de Episodios:");
		int i = 1;
		for (Episodio episodio : episodios) {
		System.out.println("Episodio "+i+": "+episodio.getTitulo());
		i++;
		}
	}
	
	public int getNumeroTemporada() {
		return numeroTemporada;
	}

	public void setNumeroTemporada(int numeroTemporada) {
		this.numeroTemporada = numeroTemporada;
	}

	public int getCantEpisodios() {
		return cantEpisodios;
	}

	public void setCantEpisodios(int cantEpisodios) {
		this.cantEpisodios = cantEpisodios;
	}



	public ArrayList<Episodio> getEpisodios() {
		return  new ArrayList(episodios);
	}

	public void setEpisodios(ArrayList<Episodio> episodios) {
		this.episodios = episodios;
	}
	
	
}
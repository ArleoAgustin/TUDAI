import java.util.ArrayList;

class Serie {
	private String titulo;
	private String descripcion;
	private String creador = "No se messi";
	private String genero;
	private ArrayList<Temporada> temporadas = new ArrayList<Temporada>();
	private Temporada temporada1;
	private Temporada temporada2;
	private Temporada temporada3;
	private Temporada temporada4;
	private Temporada temporada5;
	
	public Serie (){
		titulo = "Amor otoñal";
		descripcion =  "Propiedad de nextflip";
		genero = "romance";
		temporada1 = new Temporada(1);
		temporada2 = new Temporada(2);
		temporada3 = new Temporada(3);
		temporada4 = new Temporada(4);
		temporada5 = new Temporada(5);
		añadirTempordas(3);
		
	}
	
	public Serie (int cantTemporadas){
		titulo = "Amor otoñal";
		descripcion =  "Propiedad de nextflip";
		genero = "romance";
		temporada1 = new Temporada(1);
		temporada2 = new Temporada(2);
		temporada3 = new Temporada(3);
		temporada4 = new Temporada(4);
		temporada5 = new Temporada(5);
		añadirTempordas(cantTemporadas);
	}
	
	public Serie (int cantTemporadas, String nuevoTitulo){
		titulo = nuevoTitulo;
		descripcion =  "Propiedad de nextflip";
		genero = "Romance";
		temporada1 = new Temporada(1);
		temporada2 = new Temporada(2);
		temporada3 = new Temporada(3);
		temporada4 = new Temporada(4);
		temporada5 = new Temporada(5);
		añadirTempordas(cantTemporadas);
	}
	
	public Serie (int cantTemporadas, String nuevoTitulo, String nuevoDescripcion){
		titulo = nuevoTitulo;
		descripcion = nuevoDescripcion;
		genero = "Romance";
		temporada1 = new Temporada(1);
		temporada2 = new Temporada(2);
		temporada3 = new Temporada(3);
		temporada4 = new Temporada(4);
		temporada5 = new Temporada(5);
		añadirTempordas(cantTemporadas);
	}

	public Serie (int cantTemporadas, String nuevoTitulo, String nuevoDescripcopn, String nuevoGenero){
		titulo = nuevoTitulo;
		descripcion = nuevoDescripcopn;
		genero = nuevoGenero;
		añadirTempordas(cantTemporadas);
		temporada1 = new Temporada(1);
		temporada2 = new Temporada(2);
		temporada3 = new Temporada(3);
		temporada4 = new Temporada(4);
		temporada5 = new Temporada(5);
		añadirTempordas(cantTemporadas);
	}

	
	private void añadirTempordas (int cantTemoporadas){
		temporadas.clear();
		temporadas.add(temporada1);
		temporadas.add(temporada2);
		temporadas.add(temporada3);
		temporadas.add(temporada4);
		temporadas.add(temporada5);
		for (int i = cantTemoporadas; i < temporadas.size(); i++) {
			temporadas.remove(i);
		}
	}
	
	public String obtenerEpisodiosVistos() {
		int cantEpidodiosVistos = 0;
		int cantEpidodios = 0;;
		for (Temporada temporada : temporadas) {
			cantEpidodiosVistos += temporada.obtenerEpisodiosVistos();
			cantEpidodios += temporada.getEpisodios().size();
		}
		return (cantEpidodiosVistos+" de "+cantEpidodios);
	}
	
	public float darPromedioSerie() {
		float total = 0;
		float totalPuntuacion = 0;
		for (Temporada temporada : temporadas) {
			for (Episodio episodio : temporada.getEpisodios()) {
				if (episodio.isVisto() == true) {
					totalPuntuacion += episodio.getCalificacion();
					total++;
				}
			}
		}
		return (totalPuntuacion / total);
	}
	
	public void dameDatos() {
		System.out.println("\n\nSerie: " + titulo + "\nDescripición: "
				+ descripcion + "\nGenero: " + genero + "\nAutor: " + creador
				+ "\nEpisodios vistos: " + obtenerEpisodiosVistos()
				+ "\nPromedio de puntucaión por capitulos vistos totales: "
				+ darPromedioSerie());
	}
	
	public void dameDatosTemporadas() {
		for (Temporada temporada : temporadas) {
			temporada.dameDatos();
		}
	}
	
	public void dameDatosTemporadasEpisodios() {
		for (Temporada temporada : temporadas) {
			temporada.dameDatosEpisodios();
		}
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

package tp7a.ej3;

public class Planta {
	
	private String nombre_cientifico, nombresVulgares, clasificacion, familia, clase, tipoHabitat;
	private int sol, nivelDeRiego;
	
	
	
	
	public Planta(String nombre_cientifico, String nombresVulgares, String clasificacion, int sol, int nivelDeRiego) {
		super();
		this.nombre_cientifico = nombre_cientifico;
		this.nombresVulgares = nombresVulgares;
		this.clasificacion = clasificacion;
		this.sol = sol;
		this.nivelDeRiego = nivelDeRiego;
	}

	public Planta(String nombre_cientifico, String nombresVulgares, String clasificacion, String familia, String clase,
			String tipoHabitat, int sol, int nivelDeRiego) {
		
		this.nombre_cientifico = nombre_cientifico;
		this.nombresVulgares = nombresVulgares;
		this.clasificacion = clasificacion;
		this.familia = familia;
		this.clase = clase;
		this.tipoHabitat = tipoHabitat;
		this.sol = sol;
		this.nivelDeRiego = nivelDeRiego;
	}

	public String getNombre_cientifico() {
		return nombre_cientifico;
	}

	public void setNombre_cientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}

	public String getNombresVulgares() {
		return nombresVulgares;
	}

	public void setNombresVulgares(String nombresVulgares) {
		this.nombresVulgares = nombresVulgares;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getTipoHabitat() {
		return tipoHabitat;
	}

	public void setTipoHabitat(String tipoHabitat) {
		this.tipoHabitat = tipoHabitat;
	}

	public int getSol() {
		return sol;
	}

	public void setSol(int sol) {
		this.sol = sol;
	}

	public int getnivelDeRiego() {
		return nivelDeRiego;
	}

	public void setnivelDeRiego(int nivelDeRiego) {
		this.nivelDeRiego = nivelDeRiego;
	}
	
	
	public boolean contieneNombreVulgar(String s) {
		return this.nombresVulgares.toLowerCase().contains(s.toLowerCase());
	}
	
	public boolean contieneClasifi(String s) {
		return this.clasificacion.toLowerCase().contains(s.toLowerCase());
	}
}

package tp4.ej4;

public class Masajista extends Persona {
	
	private String titulo;
	private int aniosExp;

	public Masajista(String nombre, String apellido, String estado, int nroPasaporte, String titulo, int aniosExp) {
		
		super(nombre, apellido, estado, nroPasaporte);
		this.titulo = titulo;
		this.aniosExp = aniosExp;
	}
	
	

	public Masajista(String nombre, String apellido, String estado, int nroPasaporte) {
		super(nombre, apellido, estado, nroPasaporte);
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosExp() {
		return aniosExp;
	}

	public void setAniosExp(int aniosExp) {
		this.aniosExp = aniosExp;
	}
	
	
}

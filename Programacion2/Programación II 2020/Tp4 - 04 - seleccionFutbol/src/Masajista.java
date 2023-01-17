
public class Masajista extends ContinjenteSeleccion {
	
	private String titulo;
	private int anosExperiencia;
	
	public Masajista(String nombre, String estado, String titulo, int anosExperiencia){
		super(nombre, estado);
		this.titulo = titulo;
	}
	
	public Masajista(String nombre, String apellido, String fechaDenacimiento, int pasaporte, String estado, String titulo, int anosExperiencia){
		super(nombre, apellido, fechaDenacimiento, pasaporte, estado);
		this.titulo = titulo;
		this.anosExperiencia = anosExperiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnosExperiencia() {
		return anosExperiencia;
	}

	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
}

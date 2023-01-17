package tp2.ej1;

public class Episodio {
	
	private String titulo;
	private String descripcion;
	private Boolean seVio;
	private int calificacion;
	
	
	
	public Episodio(String titulo, String descripcion) {
		
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.seVio = false;
		this.calificacion = 0;
	}



	public void calificarEpisodio(int valor) {
		
		if(valor >=1 && valor <=5)
		this.calificacion = valor;
		else
			System.out.println("El valor ingresado no es correcto.");
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



	public Boolean getSeVio() {
		return seVio;
	}

	

	public int getCalificacion() {
		return calificacion;
	}



	public void setSeVio(Boolean seVio) {
		this.seVio = seVio;
	}
	
	
}

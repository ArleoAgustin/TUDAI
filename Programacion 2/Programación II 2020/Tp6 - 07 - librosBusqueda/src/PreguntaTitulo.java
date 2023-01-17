
public class PreguntaTitulo extends Pregunta{
	private String titulo;
	
	public PreguntaTitulo(String titulo) {
		this.titulo = titulo;
	}
	public boolean cumple(Libro libro) {
		return titulo.equals(libro.getTitulo());
	}
}

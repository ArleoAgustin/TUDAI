
public class PreguntaAutor extends Pregunta{
	private String autor;
	
	public PreguntaAutor(String palabraClave) {
		this.autor = palabraClave;
	}
	public boolean cumple(Libro libro) {
		return (libro.getPalabrasClave().contains(autor));
	}
}

public class PreguntaPalabraClave extends Pregunta{
	private String palabraClave;
	
	public PreguntaPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	public boolean cumple(Libro libro) {
		return (libro.getPalabrasClave().contains(palabraClave));
	}
}

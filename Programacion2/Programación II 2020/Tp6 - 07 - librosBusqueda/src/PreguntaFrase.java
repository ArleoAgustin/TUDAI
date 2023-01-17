
public class PreguntaFrase extends Pregunta{
	private String frase;
	
	public PreguntaFrase(String frase) {
		this.frase = frase;
	}
	public boolean cumple(Libro libro) {
		return frase.equals(libro.getContenidoTextual());
	}
}
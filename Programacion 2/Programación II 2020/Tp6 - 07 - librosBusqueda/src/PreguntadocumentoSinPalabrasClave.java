
public class PreguntadocumentoSinPalabrasClave extends Pregunta{
	
	public PreguntadocumentoSinPalabrasClave() {}
	
	public boolean cumple(Libro libro) {
		return (libro.getPalabrasClave()).size() == 0;
	}
}

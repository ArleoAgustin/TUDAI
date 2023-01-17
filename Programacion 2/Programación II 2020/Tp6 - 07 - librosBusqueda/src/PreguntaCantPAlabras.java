
public class PreguntaCantPAlabras extends Pregunta{
	
	public PreguntaCantPAlabras() {}
	
	public boolean cumple(Libro libro) {
		return (libro.getPalabrasClave()).size() >= 20;
	}

}
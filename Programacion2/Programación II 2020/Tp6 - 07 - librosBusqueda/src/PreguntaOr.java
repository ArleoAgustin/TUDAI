
public class PreguntaOr extends Pregunta{
	
	public PreguntaOr(Pregunta p1, Pregunta p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public boolean cumple(Libro libro) {
		return p1.cumple(libro) || p2.cumple(libro);
	}
}
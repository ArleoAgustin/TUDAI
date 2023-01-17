import java.util.ArrayList;

public class BuscadorLibros {

	private ArrayList<Libro> libros;

	public BuscadorLibros() {
		libros = new ArrayList<Libro>();
	}
	
	public ArrayList<Libro> foundLibro(Pregunta pregunta) {
		ArrayList<Libro> returnLibros = new ArrayList<Libro>();
		for (Libro libro : libros) {
			if(pregunta.cumple(libro)) {
				returnLibros.add(libro);
			}
		}
		return returnLibros;
	}
	public void addLibro(Libro libro) {
		libros.add(libro);
	}
}

import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		
		BuscadorLibros buscador = new BuscadorLibros();
		
		Libro l1 = new Libro("titulo 1", "Cuerpo texto 1");
		Libro l2 = new Libro("titulo 2", "Cuerpo texto 2");
		Libro l3 = new Libro("titulo 3", "Cuerpo texto 3");
		Libro l4 = new Libro("titulo 3", "Cuerpo texto 3");
		Libro l5 = new Libro("titulo", "Cuerpo texto");
		Libro l6 = new Libro("titulo", "Cuerpo texto");
		Libro l7 = new Libro("titulo", "Cuerpo texto");
		
		buscador.addLibro(l1);
		buscador.addLibro(l2);
		buscador.addLibro(l3);
		buscador.addLibro(l4);
		buscador.addLibro(l5);
		buscador.addLibro(l6);
		buscador.addLibro(l7);

		Pregunta p1 = new PreguntaTitulo("titulo 2");
		Pregunta p2 = new PreguntaTitulo("titulo");
		Pregunta p3 = new PreguntaOr(p1, p2);
		
		ArrayList<Libro> respuesta = buscador.foundLibro(p3);
		printArray(respuesta);
	}
	
	public static void printArray(ArrayList<Libro> arr) {
		String print = "Libros encontrados:\n";
		for (Libro libro : arr) {
			print += "	· "+libro+"\n";
		}
		System.out.append(print);
	}
}

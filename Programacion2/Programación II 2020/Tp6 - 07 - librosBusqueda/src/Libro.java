import java.util.ArrayList;

public class Libro {
	private String titulo;
	private ArrayList<String> autores;
	private String contenidoTextual;
	private ArrayList<String> palabrasClaves;
	
	public Libro(String titulo,String contenidoTextual) {
		this.titulo = titulo;
		autores = new ArrayList<String>();
		this.contenidoTextual = contenidoTextual;
		palabrasClaves = new ArrayList<String>();
	}
	
	public String toString() {
		return "Libro: " + titulo; 
	}
	public void addAutor(String autor){
		autores.add(autor);
	}
	public void addPalabraClave(String palabrasClave){
		palabrasClaves.add(palabrasClave);
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public ArrayList<String> getAutores() {
		return autores;
	}
	public void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}
	public String getContenidoTextual() {
		return contenidoTextual;
	}
	public void setContenidoTextual(String contenidoTextual) {
		this.contenidoTextual = contenidoTextual;
	}
	public ArrayList<String> getPalabrasClave() {
		return palabrasClaves;
	}
	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClaves = palabrasClave;
	}
}

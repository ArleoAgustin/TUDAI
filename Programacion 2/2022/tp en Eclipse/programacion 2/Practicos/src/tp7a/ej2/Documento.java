package tp7a.ej2;

import java.util.ArrayList;

public class Documento {
	
	private String titulo;
	private ArrayList<String> autores;
	private String contenido;
	private ArrayList<String> palabrasClaves;
	
	public Documento(String titulo, String contenido) {
		
		this.titulo = titulo;
		this.contenido = contenido;
		this.autores = new ArrayList<>();
		this.palabrasClaves = new ArrayList<>();
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

	public void addAutores(String autor) {
		this.autores.add(autor);
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}

	public void addPalabrasClaves(String p) {
		this.palabrasClaves.add(p);
	}

	public boolean contiene(String s) {
		return this.palabrasClaves.contains(s);
	}

	public boolean contieneAutor(String s) {
		return this.autores.contains(s);
	}
	
	public int cantPalabrasContenido() {
		return this.contenido.split(" ").length;
	}

	@Override
	public String toString() {
		return "Documento [titulo=" + titulo + ", autores=" + autores + ", contenido=" + contenido + ", palabrasClaves="
				+ palabrasClaves + "]";
	}
	
	
}

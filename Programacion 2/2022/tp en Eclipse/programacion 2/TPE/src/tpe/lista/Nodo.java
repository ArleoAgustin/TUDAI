package tpe.lista;

public class Nodo<T> {
	
	private  T contenido;
	private Nodo<T> alQueApunta;
	
	public Nodo(T contenido) {
		
		this.contenido = contenido;
		this.alQueApunta = null;
	}

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}

	public Nodo<T> getAlQueApunta() {
		return alQueApunta;
	}

	public void setAlQueApunta(Nodo<T> alQueApunta) {
		this.alQueApunta = alQueApunta;
	}
	
	
}
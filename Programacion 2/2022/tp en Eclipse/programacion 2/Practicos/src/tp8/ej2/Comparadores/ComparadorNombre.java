package tp8.ej2.Comparadores;

import tp8.ej2.Elemento;

public class ComparadorNombre extends ComparadorElemento {
	
	public ComparadorNombre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparadorNombre(ComparadorElemento siguiente) {
		super(siguiente);
		
	}

	@Override
	public int comparar(Elemento e1, Elemento e2) {
		
		return e1.getNombre().compareTo(e2.getNombre());
	}

}

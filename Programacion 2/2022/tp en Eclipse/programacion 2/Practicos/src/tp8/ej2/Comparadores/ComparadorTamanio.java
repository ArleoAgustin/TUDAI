package tp8.ej2.Comparadores;

import tp8.ej2.Elemento;

public class ComparadorTamanio extends ComparadorElemento {

	
	
	public ComparadorTamanio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparadorTamanio(ComparadorElemento siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(Elemento e1, Elemento e2) {
		
		return (int) (e1.getTamanio() - e2.getTamanio());
		
	}

}

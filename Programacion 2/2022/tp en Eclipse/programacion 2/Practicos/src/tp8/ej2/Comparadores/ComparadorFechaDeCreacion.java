package tp8.ej2.Comparadores;

import tp8.ej2.Elemento;

public class ComparadorFechaDeCreacion extends ComparadorElemento {

	
	
	public ComparadorFechaDeCreacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparadorFechaDeCreacion(ComparadorElemento siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(Elemento e1, Elemento e2) {
		
		int res;
		if(e1.getFechaCreacion().isBefore(e2.getFechaCreacion()))
			res = 1;
		else if(e1.getFechaCreacion().isAfter(e2.getFechaCreacion()))
			res = -1;
		else 
			res = 0;
		
		return res;
	}

}

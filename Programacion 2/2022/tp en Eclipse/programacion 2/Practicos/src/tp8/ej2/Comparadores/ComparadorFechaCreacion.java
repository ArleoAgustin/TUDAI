package tp8.ej2.Comparadores;

import tp8.ej2.Elemento;

public class ComparadorFechaCreacion extends ComparadorElemento {
	
	
	
	public ComparadorFechaCreacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComparadorFechaCreacion(ComparadorElemento siguiente) {
		super(siguiente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int comparar(Elemento e1, Elemento e2) {
	
		int res;
		if(e1.getFechaModificacion().isBefore(e2.getFechaModificacion()))
			res = 1;
		else if(e1.getFechaModificacion().isAfter(e2.getFechaModificacion()))
			res = -1;
		else 
			res = 0;
		
		return res;
	}


}

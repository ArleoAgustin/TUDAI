package tp8.ej2.Filtros;

import tp8.ej2.Elemento;

public class FiltroNombre extends Filtro {
	
	private String s;
	
	
	
	public FiltroNombre(String s) {
		super();
		this.s = s;
	}

	@Override
	public boolean cumple(Elemento e) {
		return e.getNombre().contains(s);
		
	}

}

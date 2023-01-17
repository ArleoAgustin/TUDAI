package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FitroPrecioAlquiler extends Filtro {
	
	private int precio;
	
	
	public FitroPrecioAlquiler(int precio) {
		super();
		this.precio = precio;
	}


	@Override
	public boolean cumple(Socio s) {
		return s.pagoAlquiler(precio);
		
	}

}

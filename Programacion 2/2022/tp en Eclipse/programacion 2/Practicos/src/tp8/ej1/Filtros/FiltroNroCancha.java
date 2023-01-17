package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FiltroNroCancha extends Filtro {
	
	private int nro;
	
	public FiltroNroCancha(int nro) {
		this.nro = nro;
	}

	@Override
	public boolean cumple(Socio s) {
		return s.alquiloCancha(nro);
	}

}

package saltarin.filtros;

import saltarin.Elemento;

public class FiltroAnd extends Filtro {

	private Filtro filtro1;
	private Filtro filtro2;
	
	public FiltroAnd(Filtro filtro1, Filtro filtro2) {
		this.filtro1 = filtro1;
		this.filtro2 = filtro2;
	}
	@Override
	public boolean cumple(Elemento elem) {
		return this.filtro1.cumple(elem) && this.filtro2.cumple(elem);
	}

}

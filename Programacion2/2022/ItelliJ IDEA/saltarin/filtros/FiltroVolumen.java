package saltarin.filtros;

import saltarin.Elemento;

public class FiltroVolumen extends Filtro {

	private int volumenMaximo;
	
	public FiltroVolumen(int volumenMaximo) {
		this.volumenMaximo = volumenMaximo;
	}
	
	@Override 
	public boolean cumple(Elemento elem) {
		return this.volumenMaximo > elem.getVolumen();
	}

}

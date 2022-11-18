package saltarin.filtros;

import saltarin.Elemento;

public class FiltroPrecio extends Filtro {

	private int precioMinimo;
	
	public FiltroPrecio(int precioMinimo) {
		this.precioMinimo = precioMinimo;
	}
	
	@Override
	public boolean cumple(Elemento elem) {
		return elem.getPrecio() > this.precioMinimo;
	}

}

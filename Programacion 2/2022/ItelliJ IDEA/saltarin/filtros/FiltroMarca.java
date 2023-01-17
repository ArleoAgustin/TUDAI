package saltarin.filtros;

import saltarin.Elemento;

public class FiltroMarca extends Filtro {

	private String marcaBuscada;
	
	public FiltroMarca(String marcaBuscada) {
		this.marcaBuscada = marcaBuscada;
	}
	
	@Override
	public boolean cumple(Elemento elem) {
		return elem.getMarca().equals(this.marcaBuscada);
	}

}

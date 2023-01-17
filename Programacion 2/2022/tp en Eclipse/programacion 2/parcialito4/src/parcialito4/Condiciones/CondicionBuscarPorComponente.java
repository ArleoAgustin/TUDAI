package parcialito4.Condiciones;

import parcialito4.Producto;

public class CondicionBuscarPorComponente extends Condicion {

	private String componente;
	
	
	
	public CondicionBuscarPorComponente(String componente) {
		
		this.componente = componente;
	}



	@Override
	public boolean cumple(Producto p) {

		return p.contieneComponente(componente);
		
	}

}

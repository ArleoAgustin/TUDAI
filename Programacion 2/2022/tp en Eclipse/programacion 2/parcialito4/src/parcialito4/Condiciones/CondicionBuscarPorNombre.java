package parcialito4.Condiciones;

import parcialito4.Producto;

public class CondicionBuscarPorNombre extends Condicion {
	
	private String s;
	
	
	
	public CondicionBuscarPorNombre(String s) {
		this.s = s;
	}



	@Override
	public boolean cumple(Producto p) {

		return s.toLowerCase().equals(p.getNombre().toLowerCase());

	}

}

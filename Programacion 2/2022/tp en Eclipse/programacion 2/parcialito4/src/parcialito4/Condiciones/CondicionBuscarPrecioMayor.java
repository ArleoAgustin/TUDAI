package parcialito4.Condiciones;

import parcialito4.Producto;

public class CondicionBuscarPrecioMayor extends Condicion {

	private double precio;
	
	
	
	public CondicionBuscarPrecioMayor(int precio) {
		
		this.precio = precio;
	}



	@Override
	public boolean cumple(Producto p) {
		
		return p.getPrecio() > precio;
	}

}

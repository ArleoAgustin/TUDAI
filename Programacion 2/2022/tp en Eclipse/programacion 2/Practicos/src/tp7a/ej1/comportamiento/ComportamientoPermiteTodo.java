package tp7a.ej1.comportamiento;

import tp7a.ej1.Cultivo;
import tp7a.ej1.Producto;

public class ComportamientoPermiteTodo extends Comportamiento {

	@Override
	public boolean esPermitido(Cultivo c, Producto p) {
		
		return true;
	}

}

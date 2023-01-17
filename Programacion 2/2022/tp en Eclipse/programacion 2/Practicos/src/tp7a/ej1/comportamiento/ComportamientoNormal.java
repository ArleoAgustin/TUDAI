package tp7a.ej1.comportamiento;

import tp7a.ej1.Cultivo;
import tp7a.ej1.Enfermedad;
import tp7a.ej1.Producto;

public class ComportamientoNormal extends Comportamiento {

	@Override
	public boolean esPermitido(Cultivo c, Producto p) {
		
		return !p.getCultivosDondeNoUsar().contains(c);
		
	}

}

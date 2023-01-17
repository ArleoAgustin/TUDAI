package tp7a.ej1.condicion;

import tp7a.ej1.Cultivo;
import tp7a.ej1.Producto;

public class CondicionTrataCultivo extends Condicion {

	Cultivo c;
	
	
	public CondicionTrataCultivo(Cultivo c) {
		
		this.c = c;
	}


	@Override
	public boolean cumple(Producto p) {
		
		return p.sePuedeUsarEnCultivo(c);
	}

}

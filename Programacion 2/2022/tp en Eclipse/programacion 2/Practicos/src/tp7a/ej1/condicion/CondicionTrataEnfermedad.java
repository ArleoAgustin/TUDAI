package tp7a.ej1.condicion;

import tp7a.ej1.Enfermedad;
import tp7a.ej1.Producto;

public class CondicionTrataEnfermedad extends Condicion {
	
	private Enfermedad e;
	
	
	
	public CondicionTrataEnfermedad(Enfermedad e) {

		this.e = e;
	}


	@Override
	public boolean cumple(Producto p) {
		return p.trataEnfermedad(this.e);
		
	}

}

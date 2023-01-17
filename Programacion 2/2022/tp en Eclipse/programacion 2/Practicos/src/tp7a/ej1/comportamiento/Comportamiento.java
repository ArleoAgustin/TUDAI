package tp7a.ej1.comportamiento;

import tp7a.ej1.Cultivo;
import tp7a.ej1.Producto;

public abstract class Comportamiento {
	
	public abstract boolean esPermitido(Cultivo c, Producto p);
}

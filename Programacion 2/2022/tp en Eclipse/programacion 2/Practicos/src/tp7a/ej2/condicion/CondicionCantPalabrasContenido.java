package tp7a.ej2.condicion;

import tp7a.ej2.Documento;

public class CondicionCantPalabrasContenido extends Condicion {
	
	private int cantPalabras;
	
	
	
	public CondicionCantPalabrasContenido(int cantPalabras) {
		super();
		this.cantPalabras = cantPalabras;
	}

	public CondicionCantPalabrasContenido() {}

	@Override
	public boolean cumple(Documento a) {
		return a.cantPalabrasContenido() >= cantPalabras;
	}

}

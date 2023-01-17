package Filtros;

import ElementosDeJuego.Atributo;
import ElementosDeJuego.Carta;

public abstract class Filtro {

	public abstract boolean cumple(Atributo a);

	public abstract boolean cumpleCompuesto(Atributo a, Atributo b);
	
	
	/*el filtro se debe hacer sobre una carta
	 * 
	 * 
	 * */

}

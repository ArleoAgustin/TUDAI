package Filtros;

import ElementosDeJuego.Atributo;
import ElementosDeJuego.Carta;

public class FiltroAtributoMayor extends Filtro {
	
	private int valor;
	
	
	public FiltroAtributoMayor(int valor) {
		
		this.valor = valor;
	}

	@Override
	public boolean cumple(Atributo a) {
		
		return a.getPoderAtributo() > valor;
	}

	@Override
	public boolean cumpleCompuesto(Atributo a, Atributo b) {
		// TODO Auto-generated method stub
		return false;
	}

}

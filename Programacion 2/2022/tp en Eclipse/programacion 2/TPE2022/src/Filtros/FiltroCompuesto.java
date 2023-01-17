package Filtros;

import ElementosDeJuego.Atributo;

public class FiltroCompuesto extends Filtro {

	private int valor1;
	private int valor2;
	
	public FiltroCompuesto(int valor1, int valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	
	@Override
	public boolean cumple(Atributo a) {
		return false;
	}


	@Override
	public boolean cumpleCompuesto(Atributo a, Atributo b) {
		
		return a.getPoderAtributo() > this.valor1 && b.getPoderAtributo() < this.valor2;
	}

}

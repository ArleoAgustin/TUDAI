package tp8.ej1.Filtros;

import tp8.ej1.Socio;

public class FiltroEdad extends Filtro {
	
	private final int menorDeEdad = 18;
	
	public FiltroEdad() {}



	@Override
	public boolean cumple(Socio s) {
		
		return s.getEdad() < this.menorDeEdad;
	}

}

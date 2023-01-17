package tp8.ej1.comparadores;

import tp8.ej1.Socio;

public class ComparadorAlquiler extends ComparadorSocio {

	private int nroCancha;
		
	public ComparadorAlquiler(int nroCancha) {
		this.nroCancha = nroCancha;
	}
	
	
	@Override
	public int comparar(Socio s1, Socio s2) {
		return s1.vecesQSeAlquilo(nroCancha) - s2.vecesQSeAlquilo(nroCancha);
	}

}

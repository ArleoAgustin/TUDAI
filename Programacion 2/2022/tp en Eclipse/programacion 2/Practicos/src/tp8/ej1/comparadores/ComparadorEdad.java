package tp8.ej1.comparadores;

import tp8.ej1.Socio;

public class ComparadorEdad extends ComparadorSocio {

	@Override
	public int comparar(Socio s1, Socio s2) {
		
		return s1.getEdad() - s2.getEdad();
		
	}

}

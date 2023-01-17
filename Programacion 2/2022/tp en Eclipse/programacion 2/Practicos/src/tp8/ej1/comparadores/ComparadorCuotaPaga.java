package tp8.ej1.comparadores;

import tp8.ej1.Socio;

public class ComparadorCuotaPaga extends ComparadorSocio {

	@Override
	public int comparar(Socio s1, Socio s2) {
		
		return Boolean.compare(s1.isCuotaPaga(), s2.isCuotaPaga());
	}
}

package tp8.ej1.comparadores;

import tp8.ej1.Socio;

public class ComparadorNombre extends ComparadorSocio {

	
	
	public ComparadorNombre() {
		super();
		
	}

	public ComparadorNombre(ComparadorSocio sig) {
		super(sig);
	}

	@Override
	public int comparar(Socio s1, Socio s2) {
		
		return s1.getNombre().compareTo(s2.getNombre());
	}

}

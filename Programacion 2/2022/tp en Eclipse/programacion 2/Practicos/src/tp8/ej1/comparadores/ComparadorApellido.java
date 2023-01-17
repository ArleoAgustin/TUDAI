package tp8.ej1.comparadores;

import tp8.ej1.Socio;

public class ComparadorApellido extends ComparadorSocio {

	
	
	public ComparadorApellido() {
		super();
		
	}

	public ComparadorApellido(ComparadorSocio sig) {
		super(sig);
	}

	@Override
	public int comparar(Socio s1, Socio s2) {
		
		return s1.getApellido().compareTo(s2.getApellido());
	}

}

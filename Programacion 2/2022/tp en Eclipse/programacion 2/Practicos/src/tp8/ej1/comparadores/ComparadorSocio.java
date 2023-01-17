package tp8.ej1.comparadores;

import java.util.Comparator;

import tp8.ej1.Socio;

public abstract class ComparadorSocio implements Comparator<Socio> {

	private ComparadorSocio siguiente;
	
	public ComparadorSocio() {
		this.siguiente = null;
		
	}
	
	public ComparadorSocio(ComparadorSocio sig) {
		this.siguiente = sig;
	}
	
	public abstract int comparar(Socio s1, Socio s2);
	
	
	@Override
	public int compare(Socio s1, Socio s2) {
		
		int res = this.comparar(s1, s2);
		if(res == 0) {
			if(siguiente!=null) 
				return siguiente.compare(s1, s2);
			else
				return 0;
		}
		return res;
	}
	
	
}

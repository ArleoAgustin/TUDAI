package tp8.ej2.Comparadores;

import java.util.Comparator;

import tp8.ej1.Socio;
import tp8.ej2.Elemento;

public abstract class ComparadorElemento implements Comparator<Elemento> {
	
	private ComparadorElemento siguiente;

	
	public ComparadorElemento(ComparadorElemento siguiente) {
		this.siguiente = siguiente;
	}

	public ComparadorElemento() {this.siguiente = null;}
	
	
	public abstract int comparar(Elemento e1, Elemento e2);

	@Override
	public int compare(Elemento s1, Elemento s2) {
		
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

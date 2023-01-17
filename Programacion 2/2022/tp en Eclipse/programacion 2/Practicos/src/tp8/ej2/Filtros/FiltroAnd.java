package tp8.ej2.Filtros;
import tp8.ej2.Elemento;

public class FiltroAnd extends Filtro {
	
	private Filtro c1, c2;
	
	
	
	public FiltroAnd(Filtro c1, Filtro c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}



	@Override
	public boolean cumple(Elemento a) {
		
		return c1.cumple(a) && c2.cumple(a);
	}

}

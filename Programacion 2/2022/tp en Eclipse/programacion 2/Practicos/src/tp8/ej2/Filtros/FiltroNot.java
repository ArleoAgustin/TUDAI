package tp8.ej2.Filtros;
import tp8.ej2.Elemento;

public class FiltroNot extends Filtro {
	
	private Filtro c;
	
	public FiltroNot(Filtro c) {
		super();
		this.c = c;
	}



	@Override
	public boolean cumple(Elemento a) {
		return !c.cumple(a);
	}

}

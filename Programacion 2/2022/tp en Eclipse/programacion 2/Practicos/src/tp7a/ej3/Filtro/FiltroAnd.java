package tp7a.ej3.Filtro;

import tp7a.ej3.Planta;

public class FiltroAnd extends Filtro {

	private Filtro f1, f2;
	
	
	
	public FiltroAnd(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}



	@Override
	public boolean cumple(Planta p) {
		
		return f1.cumple(p) && f2.cumple(p);
	}
	

}

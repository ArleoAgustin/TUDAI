package recuperatorioSeguros.Filtros;

import recuperatorioSeguros.Seguro;

public class FiltroCompuesto extends Filtro {
	
	private Filtro f1, f2;
	
	public FiltroCompuesto(Filtro f1, Filtro f2) {
		super();
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean cumple(Seguro s) {
		
		return f1.cumple(s) && f2.cumple(s);
	}
}

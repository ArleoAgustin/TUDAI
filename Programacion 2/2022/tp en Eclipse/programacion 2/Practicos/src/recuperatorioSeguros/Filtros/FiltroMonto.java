package recuperatorioSeguros.Filtros;

import recuperatorioSeguros.Seguro;

public class FiltroMonto extends Filtro {

	private double monto;
	
	
	
	public FiltroMonto(double monto) {
		super();
		this.monto = monto;
	}


	@Override
	public boolean cumple(Seguro s) {
		return s.getMonto() > monto;
	}

}

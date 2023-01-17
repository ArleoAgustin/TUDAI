package recuperatorioSeguros.comportamiento;

import recuperatorioSeguros.Seguro;

public class MontoCostoFijo extends CalculadorCosto {

	private double monto;
	
	

	public MontoCostoFijo(double monto) {
		super();
		this.monto = monto;
	}



	@Override
	public double calcularCosto(Seguro s) {
		
		return monto;
		}

}

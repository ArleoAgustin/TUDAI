package recuperatorioSeguros.comportamiento;

import recuperatorioSeguros.Seguro;

public class MontoPorcentaje extends CalculadorCosto {

	private double porcentaje;
	
	
	
	public MontoPorcentaje(double porcentaje) {
		super();
		this.porcentaje = porcentaje;
	}



	@Override
	public double calcularCosto(Seguro s) {
		
		return s.getValorAsegurado() * porcentaje;
	}

}

package recuperatorioSeguros.comportamiento;

import recuperatorioSeguros.Seguro;

public class CalculadorSuma extends CalculadorCosto {
	
	private CalculadorCosto c1,c2;
	
	
	public CalculadorSuma(CalculadorCosto c1, CalculadorCosto c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public double calcularCosto(Seguro s) {
		return c1.calcularCosto(s) + c2.calcularCosto(s);
	}

}

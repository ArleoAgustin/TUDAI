
public class OperadorSuma extends Operador{

	public OperadorSuma(char operador) {
		super(operador);
	}

	public OperadorSuma(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	@Override
	public double ejecutarOeraciib(double a, double b) {
		return a+b;
	}

}

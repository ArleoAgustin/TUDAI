
public class OperadorPotencia extends Operador{

	public OperadorPotencia(char operador) {
		super(operador);
	}

	public OperadorPotencia(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	
	@Override
	public double ejecutarOeraciib(double a, double b) {
		return Math.pow(a, b);
	}
}

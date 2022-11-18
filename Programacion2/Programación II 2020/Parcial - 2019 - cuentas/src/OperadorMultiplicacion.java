
public class OperadorMultiplicacion extends Operador{

	public OperadorMultiplicacion(char operador) {
		super(operador);
	}

	public OperadorMultiplicacion(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	@Override
	public double ejecutarOeraciib(double a, double b) {
		return a*b;
	}

}

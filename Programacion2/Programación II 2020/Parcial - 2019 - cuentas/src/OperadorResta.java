
public class OperadorResta extends Operador{

	public OperadorResta(char operador) {
		super(operador);
	}

	public OperadorResta(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	@Override
	public double ejecutarOeraciib(double a, double b) {
		return a-b;
	}

}

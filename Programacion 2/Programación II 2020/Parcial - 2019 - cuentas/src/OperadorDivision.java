
public class OperadorDivision extends Operador{

	public OperadorDivision(char operador) {
		super(operador);
	}

	public OperadorDivision(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	@Override
	public double ejecutarOeraciib(double a, double b) {
		if( a/b+""!="NaN") 	 	 
			return a/b;
		else
			return super.getValorPorDefecto();
	}
}

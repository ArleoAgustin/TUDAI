
public class OperadorRaiz extends Operador{
	public OperadorRaiz(char operador) {
		super(operador);
	}

	public OperadorRaiz(Operador operador) {
		super(operador.getOperador());
	}
	
	public Operador getCopy(Operador operador) {
		return new OperadorPotencia(operador);
	}
	@Override
	public double ejecutarOeraciib(double a, double b) {
		if(Math.pow(a, (double)1.0/b)+""!="NaN") 	 	 
			return Math.pow(a, (double)1.0/b);
		else
			return super.getValorPorDefecto();
	}
}

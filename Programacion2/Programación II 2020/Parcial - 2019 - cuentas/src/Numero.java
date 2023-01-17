
public class Numero extends Exprecion{
	private double valor;
	
	public Numero(double valor) {
		this.valor = valor;
	}
	
	public Numero(Numero numero) {
		this.valor = new Double(numero.getValor());
	}
	

	@Override
	public String getExprecion() {
		return toString();
	}

	@Override
	public String getNumeros() {
		return toString();
	}

	@Override
	public String getOperadores() {
		return "";
	}

	@Override
	public String toString() {
		return ""+ valor ;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public Exprecion getCopia() {
		return new Numero(new Double(valor));
	}
}

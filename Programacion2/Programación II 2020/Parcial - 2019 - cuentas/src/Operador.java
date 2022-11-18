
public abstract class Operador {
	private char operador;
	private int valorPorDefecto = -23;
	
	public Operador(char operador) {
		this.operador = operador;
	}
	
	public Operador(Operador operador) {
		this.operador = operador.getOperador();
	}
	
	public abstract double ejecutarOeraciib(double a, double b);
	public abstract Operador getCopy(Operador operador);

	@Override
	public String toString() {
		return ""+operador;
	}

	public char getOperador() {
		return operador;
	}

	public int getValorPorDefecto() {
		return valorPorDefecto;
	}

	public void setValorPorDefecto(int valorPorDefecto) {
		this.valorPorDefecto = valorPorDefecto;
	}
}

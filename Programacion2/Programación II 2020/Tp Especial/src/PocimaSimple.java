
public abstract class PocimaSimple extends Pocima{
	private double valorDeAumento;
	
	public PocimaSimple(String nombre,int valorDeAumento) {
		super(nombre);
		this.valorDeAumento = (double) valorDeAumento;
	}

	// Aumentar el valor del atributo
	public abstract double aumentarAtributo(String nombre, double valor);
	
	// Obtener el valor de aumento
	public double getValorDeAumento() {
		return valorDeAumento;
	}
}




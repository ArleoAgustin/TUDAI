
public class PocimaGeneral extends PocimaSimple {

	public PocimaGeneral(String nombre, int valorDeAumento) {
		super(nombre, valorDeAumento);
	}

	// Aumentar el valor de todos los atributos
	@Override
	public double aumentarAtributo(String nombre, double valor) {
		return valor+valor*(super.getValorDeAumento()/100);
	}
}

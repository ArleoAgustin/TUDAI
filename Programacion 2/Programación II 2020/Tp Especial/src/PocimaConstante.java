
public class PocimaConstante extends PocimaSimple{
	public PocimaConstante(String nombre, int valorDeAumento) {
		super(nombre, valorDeAumento);
	}

	// Setear el valor a una constante
	@Override
	public double aumentarAtributo(String nombre, double valor) {
		return super.getValorDeAumento();
	}

}



public class PocimaEspecifica extends PocimaSimple{
	private String nombreAtributo;

	public PocimaEspecifica(String nombre, int valorDeAumento, String nombreAtributo) {
		super(nombre, valorDeAumento);
		this.nombreAtributo = nombreAtributo;
	}

	// Aumentar el valor del atributo en caso de que tengan el mismo nombre
	@Override
	public double aumentarAtributo(String nombre, double valor) {
		if (nombre.equals(this.nombreAtributo)) {
			return valor+valor*(super.getValorDeAumento()/100);
		}
		return valor;
	}

}

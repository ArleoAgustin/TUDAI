
public class Obstinado extends EstrategiaDeJuego{
	private String nombreAtributo;

	public Obstinado(String nombreAtributo) {
		this.nombreAtributo = nombreAtributo;
	}
	
	// Encontra siempre el atributo que tenga el mismo nombre
	@Override
	public Atributo usarEstrategia(Carta c) {
		return c.encontrarAtributo(nombreAtributo);
	}
}

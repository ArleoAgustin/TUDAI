import java.util.ArrayList;


public class Timbero extends EstrategiaDeJuego{
	// Se le pide a la carta un atributo al azar
	@Override
	public Atributo usarEstrategia(Carta c) {
		ArrayList<String> aux = c.obtenerNombreDeAtributos();
		return c.encontrarAtributo(aux.get((int) Math.random()*aux.size()));
	}
}

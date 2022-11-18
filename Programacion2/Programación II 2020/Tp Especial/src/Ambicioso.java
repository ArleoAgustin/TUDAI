
public class Ambicioso extends EstrategiaDeJuego{
	// Se le pide a la carta su atributo con mayor valor
	@Override
	public Atributo usarEstrategia(Carta c) {
		Atributo a1 = new Atributo("", 0);
		for (String nombre :  c.obtenerNombreDeAtributos()) {
			Atributo a2 = c.encontrarAtributo(nombre);
			if (a2.compareTo(a1)>0) {
				a1 = a2;
			}
		}
		return a1;
	}
}

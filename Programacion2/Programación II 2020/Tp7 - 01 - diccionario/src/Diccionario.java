import java.util.ArrayList;
import java.util.Collections;


public class Diccionario {
	
	private ArrayList<Palabra> palabras;
	
	public Diccionario() {
		palabras =  new ArrayList<Palabra>();
	}
	
	public void removePalabra(String p2) {
		for (Palabra p1 : palabras) {
			if ((p1.getPalabra().equals(p2))) {
				palabras.remove(p1);
			}
		}
	}
	
	public ArrayList<Palabra> ordenarDiccionario(int v1, int v2) {
		ArrayList<Palabra> retorno = new ArrayList<Palabra>();
		for (int i = 0; i < palabras.size(); i++) {
			palabras.get(i);
		}
		Collections.sort(retorno);
		return retorno;
	}
	
	public Palabra buscarPalabra(Palabra p2) {
		return palabras.get(buscarPostPalabra(p2));
	}
	
	public int buscarPostPalabra(Palabra p2) {
		for (int i = 0; i < palabras.size(); i++) {
			if ((palabras.get(i).getPalabra().equals(p2))) {
				return i;
			}
		}
		return -1;
	}
}

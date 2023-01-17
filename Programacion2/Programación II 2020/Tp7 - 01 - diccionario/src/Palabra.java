import java.util.ArrayList;
import java.util.Collections;

public class Palabra implements Comparable<Palabra>{
	
	private String palabra;
	private ArrayList<String> definiciones;
	private ArrayList<String> antonimo;
	private ArrayList<String> sinonimo;
	private ArrayList<String> fucnionGramatical;
	
	public Palabra(String palabra) {
		this.palabra = palabra;
		definiciones = new ArrayList<String>();
		antonimo = new ArrayList<String>();
		sinonimo = new ArrayList<String>();
		fucnionGramatical = new ArrayList<String>();
	}
	
	@Override
	public int compareTo(Palabra p) {
		return palabra.compareTo(p.getPalabra());
	}
	
	public void addDefiniciones(String a) {
		definiciones.add(a);
	}
	
	public void addAntonimos(String a) {
		antonimo.add(a);
	}
	
	public void addSinonimo(String a) {
		sinonimo.add(a);
	}
	
	public void addFucnionGramatical(String a) {
		fucnionGramatical.add(a);
	}
	
	public ArrayList<String> getDefiniciones() {
		return getDefiniciones(definiciones);
	}
	
	public ArrayList<String> getAntonimos() {
		return getDefiniciones(antonimo);
	}
	
	public ArrayList<String> getSinonimo() {
		return getDefiniciones(sinonimo);
	}
	
	public ArrayList<String> getFucnionGramatical() {
		return getDefiniciones(fucnionGramatical);
	}
	
	private ArrayList<String> getDefiniciones(ArrayList<String> arr) {
		ArrayList<String> retorno = new ArrayList<String>();
		for (String p : arr) {
			retorno.add(p);
		}
		Collections.sort(retorno);
		return retorno;
	}
	
	public void orderPalabras(ArrayList<String> palabras) {
		Collections.sort(palabras);
	}
	
	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		this.palabra = palabra;
	}
	
	public boolean equals(Object o) {
		try {
			Palabra p = (Palabra) o;
			return palabra.equals(p.getPalabra());
		} catch (Exception exc) {
			return false;
		}
	}
}

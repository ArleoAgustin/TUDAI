package parcialTraductor2020;

import java.util.ArrayList;

public class Parrafo extends Elemento {
	
	private ArrayList<String> palabras;

	public Parrafo(String idioma) {
		super(idioma);
		
		this.palabras = new ArrayList<>();
		
	}

	public ArrayList<String> getPalabras() {
		return palabras;
	}

	public void addPalabras(String p) {
		this.palabras.add(p);
	}

	@Override
	public int cantPalabras() {

		return this.palabras.size();
	}
	
	
	public Parrafo copiar() {
		
		Parrafo copia = new Parrafo(this.getIdioma());
		
		for(String s: this.palabras) {
			copia.addPalabras(s); 
		}
		return copia;
	}
	

	
}

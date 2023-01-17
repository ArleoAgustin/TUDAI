package parcialTraductor2020;

import java.util.ArrayList;

public abstract class Elemento {

	private String idioma;

	
	
	public Elemento(String idioma) {
		super();
		this.idioma = idioma;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public abstract int cantPalabras();
}

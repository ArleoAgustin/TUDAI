package parcialTraductor2020;

import java.util.ArrayList;

public class Articulo extends Elemento {
	
	private String titulo;
	private ArrayList<Elemento> loComponen;

	public Articulo(String idioma, String titulo) {
		super(idioma);
		this.setTitulo(titulo);
		this.setLoComponen(new ArrayList<>());
	}

	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public ArrayList<Elemento> getLoComponen() {
		return loComponen;
	}


	public void setLoComponen(ArrayList<Elemento> loComponen) {
		this.loComponen = loComponen;
	}


	@Override
	public int cantPalabras() {

		int aux = 0;
		
		for(Elemento e: this.loComponen) {
			aux+= e.cantPalabras();
		}
		
		return aux;
	}
	
	


}

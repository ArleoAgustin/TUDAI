package tp8.ej2;

import java.util.ArrayList;

import tp8.ej2.Filtros.Filtro;

public class Archivo extends Elemento {

	private double tamanio;
	

	public Archivo(String nombre, double tamanio) {
		super(nombre);
		this.tamanio = tamanio;
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	@Override
	public int cantElementos() {
		
		return 1;
	}

	public void setTamanio(double tamanio) {
		this.tamanio = tamanio;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		
		ArrayList<Elemento> res = new ArrayList<>();
		
		if(f.cumple(this))
			res.add(this);
		
		return res;
	}
	
	
	
}

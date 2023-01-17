package tp8.ej2;

import java.util.ArrayList;

import tp8.ej2.Filtros.Filtro;

public class Carpeta extends Elemento {
	
	private ArrayList<Elemento> elementos;

	public Carpeta(String nombre) {
		super(nombre);
		this.elementos = new ArrayList<>();
	}

	@Override
	public double getTamanio() {
		
		double tamanio =0.0;
		
		for(Elemento e: elementos)
			tamanio+= e.getTamanio();
		return 0;
	}

	@Override
	public int cantElementos() {
		
		int cant =1;
		for(Elemento e: elementos)
			cant += e.cantElementos();
		return 0;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		
		ArrayList<Elemento> res = new ArrayList<>();
		
		for (Elemento e: elementos) {
			ArrayList<Elemento> resultadoHijo = e.buscar(f);
			res.addAll(resultadoHijo);
		}
		
		if (f.cumple(this)) {
			res.add(this);
		}
		return res;
	}
	
	
	
	
	
}

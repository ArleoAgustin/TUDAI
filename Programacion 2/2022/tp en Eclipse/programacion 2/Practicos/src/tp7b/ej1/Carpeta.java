package tp7b.ej1;

import java.util.ArrayList;

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
	
	
	
	
	
}

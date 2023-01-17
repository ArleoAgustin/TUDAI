package tp8.ej2;

import java.util.ArrayList;

import tp8.ej2.Filtros.Filtro;

public class AccesoDirecto extends Elemento {

	private static final double tamanio = 1;
	
	public AccesoDirecto(Elemento alQueApunta) {
	
		super(alQueApunta.getNombre());
		
		
	}

	@Override
	public double getTamanio() {
		return tamanio;
	}

	@Override
	public int cantElementos() {
		return 1;
	}

	@Override
	public ArrayList<Elemento> buscar(Filtro f) {
		
		ArrayList<Elemento> res = new ArrayList<>();
		
		if(f.cumple(this))
			res.add(this);
		
		return res;
	}

	


}

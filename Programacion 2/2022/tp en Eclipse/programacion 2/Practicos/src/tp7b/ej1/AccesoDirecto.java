package tp7b.ej1;

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

	


}

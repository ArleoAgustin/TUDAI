package tp5.ej3;

public class Pastura extends Cereal {
	
	private int minimoHectareas;

	public Pastura(String nombre, int minimoHectareas) {
		super(nombre);
		this.minimoHectareas = minimoHectareas;
	}

	public int getMinimoHectareas() {
		return minimoHectareas;
	}

	public void setMinimoHectareas(int minimoHectareas) {
		this.minimoHectareas = minimoHectareas;
	}


	public boolean esAdecuado(Lote l) {
		
		
		return super.esAdecuado(l) && l.getHectareas() >= minimoHectareas;
	}
	
}

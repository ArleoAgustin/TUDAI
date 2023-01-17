package tp4.ej4;

public class Futbolista extends Persona {

	private String posicion, piernaHabil;
	private int cantGoles;
	
	public Futbolista(String nombre, String apellido, String estado, int nroPasaporte, String posicion,
			String piernaHabil, int cantGoles) {
	
		super(nombre, apellido, estado, nroPasaporte);
		this.posicion = posicion;
		this.piernaHabil = piernaHabil;
		this.cantGoles = cantGoles;
	}
	
	

	public Futbolista(String nombre, String apellido, String estado, int nroPasaporte) {
		super(nombre, apellido, estado, nroPasaporte);
	}



	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPiernaHabil() {
		return piernaHabil;
	}

	public void setPiernaHabil(String piernaHabil) {
		this.piernaHabil = piernaHabil;
	}

	public int getCantGoles() {
		return cantGoles;
	}

	public void setCantGoles(int cantGoles) {
		this.cantGoles = cantGoles;
	}
	
	
	
}
package tp3.ej3;

public class Cualidad {
	
	private String nombreCualidad;
	private int valor;

	public Cualidad(String n, int cualidad) {
		
		this.nombreCualidad = n;
		this.valor = cualidad;
	}

	
	public String getNombreCualidad() {
		return nombreCualidad;
	}

	public void setNombreCualidad(String nombreCualidad) {
		this.nombreCualidad = nombreCualidad;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int cualidad) {
		this.valor = cualidad;
	}
	
	
	
	
	
}

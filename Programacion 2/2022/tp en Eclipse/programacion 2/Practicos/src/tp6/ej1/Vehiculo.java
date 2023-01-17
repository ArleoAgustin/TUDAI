package tp6.ej1;

public class Vehiculo extends Item {
	
	private String marca, patente, combustible;
	private int km;
	private boolean estaAlquilado;
	
	
	public Vehiculo(String marca, String patente, String combustible, int km) {
		
		this.marca = marca;
		this.patente = patente;
		this.combustible = combustible;
		this.km = km;
		this.estaAlquilado = false;
	}

	@Override
	public boolean sePuedeAlquilar() {
		
		return !this.estaAlquilado;
	}

	@Override
	public void alquilarItem() {
		if(sePuedeAlquilar())
			this.estaAlquilado = true;

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public boolean isEstaAlquilado() {
		return estaAlquilado;
	}

	public void setEstaAlquilado(boolean estaAlquilado) {
		this.estaAlquilado = estaAlquilado;
	}
	
	

}

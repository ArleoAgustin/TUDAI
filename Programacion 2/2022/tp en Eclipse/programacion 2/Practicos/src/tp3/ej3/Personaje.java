package tp3.ej3;

import java.util.ArrayList;

public class Personaje {
	
	private String nombreReal, nombreDeSuperHeroe;
	private ArrayList<Cualidad> cualidades = new ArrayList<Cualidad>();
	
	
	
	public Personaje(String nombreReal, String nombreDeSuperHeroe) {
	
		this.nombreReal = nombreReal;
		this.nombreDeSuperHeroe = nombreDeSuperHeroe;
	}

	public String getNombreReal() {
		return nombreReal;
	}
	
	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}
	
	public String getNombreDeSuperHeroe() {
		return nombreDeSuperHeroe;
	}
	
	public void setNombreDeSuperHeroe(String nombreDeSuperHeroe) {
		this.nombreDeSuperHeroe = nombreDeSuperHeroe;
	}
	
	public ArrayList<Cualidad> getCualidades() {
		return cualidades;
	}
	
	public void addCualidad(Cualidad c) {
		this.cualidades.add(c);
	}
	
	
	
}

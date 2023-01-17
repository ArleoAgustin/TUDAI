package tp4.ej4;

import java.util.ArrayList;
import java.util.Iterator;

public class Seleccion {
	
	private String pais;
	private ArrayList<Persona> plantel = new ArrayList<Persona>();

	public Seleccion(String pais) {
		
		this.pais = pais;
	}
	
	public boolean estaDisponible(Persona p) {
		
		for(Persona pe: this.plantel) {
			if(pe.equals(p))
				return pe.estaDisponible();
				
		}
		return false;
	}
	
	
	public String getPais() {
		return pais;
	}
	
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public ArrayList<Persona> getPlantel() {
		return plantel;
	}
	public void addPersona(Persona p) {
		this.plantel.add(p);
	}

	@Override
	public String toString() {
		return "Seleccion [pais=" + pais + ", plantel=" + plantel + "]";
	}
	
	
}

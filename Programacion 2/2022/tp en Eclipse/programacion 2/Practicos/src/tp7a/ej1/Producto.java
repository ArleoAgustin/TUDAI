package tp7a.ej1;

import java.util.ArrayList;

public class Producto {
	
	private String nombre;
	private ArrayList<Cultivo> cultivosDondeNoUsar;
	private ArrayList<String> patologiasQueTrata;
	
	public Producto(String nombre) {
		
		this.nombre = nombre;
		this.cultivosDondeNoUsar = new ArrayList<Cultivo>();
		this.patologiasQueTrata = new ArrayList<String>();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Cultivo> getCultivosDondeNoUsar() {
		return new ArrayList<>(cultivosDondeNoUsar);
	}
	public void addCultivosDondeNoUsar(Cultivo c) {
		this.cultivosDondeNoUsar.add(c);
	}
	public ArrayList<String> getPatologiasQueTrata() {
		return new ArrayList<>(patologiasQueTrata);
	}
	public void addPatologias(String p) {
		this.patologiasQueTrata.add(p);
	}
	
	public boolean trataEnfermedad(Enfermedad e) {
		return this.patologiasQueTrata.containsAll(e.getPatologias());
		
	}
	
	public boolean sePuedeUsarEnCultivo(Cultivo c) {
		
		return !this.cultivosDondeNoUsar.contains(c);
	}

	@Override
	public String toString() {
		return "Producto" + nombre ;
	}
	
	
	
}

package tp7a.ej1;

import java.util.ArrayList;

public class Enfermedad {
	
	private String nombre;
	private ArrayList<String> patologias;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		patologias = new ArrayList<String>();
				
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<String> getPatologias() {
		return new ArrayList<>(patologias);
	}

	public void addPatologias(String p) {
		this.patologias.add(p);
	}

	@Override
	public String toString() {
		return "Enfermedad [nombre=" + nombre + "]";
	}
	
	
	
	
	
}

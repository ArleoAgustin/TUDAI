package tp5.ej2;

import java.util.ArrayList;

public class Alumno {
	
	private String nombre;
	private Casa casaPertenece;
	private ArrayList<String> cualidades = new ArrayList<String>();
	private ArrayList<Alumno> familiares = new ArrayList<Alumno>();
	
	
	
	public Alumno(String nombre) {
		
		this.nombre = nombre;
	}
	
	
	public void addFamiliar(Alumno a) {
		
		familiares.add(a);
	}
	
	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public Casa getCasaPertenece() {
		return casaPertenece;
	}

	

	public ArrayList<Alumno> getFamiliares() {
		return familiares;
	}



	public void setFamiliares(ArrayList<Alumno> familiares) {
		this.familiares = familiares;
	}



	public void setCasaPertenece(Casa casaPertenece) {
		this.casaPertenece = casaPertenece;
	}



	public void addCualidad(String c) {
		cualidades.add(c);
	}

	public boolean tieneCualidades(Casa c) {
		
		
		for(String c1: c.getCualidades()) {
			if(!cualidades.contains(c1)){
				return false;
			}
		}
		return true;
	}
}

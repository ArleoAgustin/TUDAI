package tp5.ej2;

import java.util.ArrayList;

public class Casa {
	
	private String nombreCasa;
	private int cantMaxAlumnos;
	private ArrayList<String> cualidades = new ArrayList<String>();
	protected ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
	
	
	
	public Casa(int cantMaxAlumnos, String nombreCasa) {
		this.nombreCasa = nombreCasa;
		this.cantMaxAlumnos = cantMaxAlumnos;
	}


	public void addAlumno(Alumno a) {
		
		if(alumnos.size() < cantMaxAlumnos){
			
			if(cumple(a)) {
				a.setCasaPertenece(this);
				alumnos.add(a);
			}
			else
				System.out.println("No cumple con las cualidades de la casa");
		}
		else
			System.out.println("La casa se encuentra completa");
	}
	
	public void addCualidad(String c) {
		
		cualidades.add(c);
	}
	
	
	public ArrayList<String> getCualidades() {
		return cualidades;
	}


	public boolean cumple(Alumno a) {
		
		return a.tieneCualidades(this);
	}


	public int getCantMaxAlumnos() {
		return cantMaxAlumnos;
	}


	public void setCantMaxAlumnos(int cantMaxAlumnos) {
		this.cantMaxAlumnos = cantMaxAlumnos;
	}
	
	


	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	


	public String getNombreCasa() {
		return nombreCasa;
	}


	public void setNombreCasa(String nombreCasa) {
		this.nombreCasa = nombreCasa;
	}


	@Override
	public String toString() {
		System.out.println("");
		return nombreCasa + " cantMaxAlumnos=" + cantMaxAlumnos + ", cualidades=" + cualidades
				+ ", alumnos=" + alumnos + "";
	}


}
	


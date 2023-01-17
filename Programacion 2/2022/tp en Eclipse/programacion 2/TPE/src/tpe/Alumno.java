package tpe;

import java.util.ArrayList;

public class Alumno extends Elemento{
	
	private String apellido;
	private int edad, dni;
	
	private ArrayList<String> intereses;

	public Alumno(String nombre, String apellido, int edad, int dni) {
		super(nombre);
		
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		this.intereses = new ArrayList<>();
	}


	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public ArrayList<String> getIntereses() {
		return new ArrayList<>(intereses);
	}

	public void addInteres(String i) {
		this.intereses.add(i);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + super.getNombre() + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni
				+ ", intereses=" + intereses + "]";
	}

	@Override
	public int getCantAlumnos() {return 1;}
	
	
	
	
}
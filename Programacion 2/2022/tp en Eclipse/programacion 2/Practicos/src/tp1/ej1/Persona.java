package tp1.ej1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;
	private LocalDate fechaNacimiento;
	private int DNI;
	private double peso;
	private double altura;
	private String sexo;
	
	public Persona(int dNI) {
		this.nombre = "Agustin";
		this.fechaNacimiento = LocalDate.of(2000, 01, 5);
		DNI = dNI;
		this.peso = 1;
		this.altura = 1;
		this.sexo = "Femenino";
		
	}

	public Persona(String nombre, String apellido, int dNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		DNI = dNI;
	}

	public Persona(String nombre, String apellido, LocalDate fechaNacimiento, int dNI) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		DNI = dNI;
	}

	public Persona(String nombre, String apellido, int edad, int dNI, double peso) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		DNI = dNI;
		this.peso = peso;
	}

	public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, int dNI, double peso, double altura) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		DNI = dNI;
		this.peso = peso;
		this.altura = altura;
	}

	public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, int dNI, double peso, double altura, String sexo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.fechaNacimiento = fechaNacimiento;
		DNI = dNI;
		this.peso = peso;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	
	public double imc() {
		
		return this.peso / (this.altura * this.altura);
	}
	
	public boolean enForma() {
		
		return this.imc() >= 18.5 && this.imc() <= 25;
	}
	
	public boolean cumpleAnios() {
		
		return this.fechaNacimiento.isEqual(LocalDate.now());		
	}
	
	public boolean esMayor() {
		
		return this.edad >= 18;
			
		
	}
	
	public boolean puedeVotar() {
		return this.edad > 16;
	}
	
	public boolean esCoherente() {
		
		Period p = Period.between(fechaNacimiento, LocalDate.now());
		return p.getYears() == this.edad;
	}
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", fechaNacimiento="
				+ fechaNacimiento + ", DNI=" + DNI + ", peso=" + peso + ", altura=" + altura + ", sexo=" + sexo + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	
	
	
	
	
	
}

package tp5.ej5;

public class Empleado {
	
	private String nombre, apellido;
	private int dni;
	private double sueldoMensual;
	
	public Empleado(String nombre, String apellido, int dni, double sueldoMensual) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoMensual = sueldoMensual;
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

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public int getDni() {
		return dni;
	}
	
	
	
	
}

package tp4.ej5b;

public class Persona {
	
	private String cargo, nombre, apellido;
	private int edad;
	
	public Persona(String nombre, String apellido, String cargo, int edad) {
		super();
		this.cargo = cargo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
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

	@Override
	public String toString() {
		return  nombre +" " + apellido + "\n" +
				"Edad: " + edad + "\n"+
				"Cargo: "+ cargo + "\n";
	}
	
	
	
}

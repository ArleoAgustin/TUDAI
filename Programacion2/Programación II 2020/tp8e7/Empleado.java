package tp8e7;

public class Empleado {
	private String nombre;
	private int sueldo;
	private String especialidad;
	
	public Empleado(String nombre, int sueldo, String especialidad) {
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.especialidad = especialidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public boolean tieneEspecialidad(String e){
		return this.equals(e);
	}
}

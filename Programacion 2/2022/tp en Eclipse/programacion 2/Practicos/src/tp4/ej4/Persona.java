package tp4.ej4;

import java.time.LocalDate;

public class Persona {

	private String nombre, apellido, estado;
	private int nroPasaporte;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, String estado, int nroPasaporte) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado = estado;
		this.nroPasaporte = nroPasaporte;
	}
	
	public boolean estaDisponible() {
		
		if(this.estado.equals("En pais de origen"))
			return true;
		
		return false;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getNroPasaporte() {
		return nroPasaporte;
	}

	public void setNroPasaporte(int nroPasaporte) {
		this.nroPasaporte = nroPasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
}

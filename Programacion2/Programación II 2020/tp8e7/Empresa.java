package tp8e7;

import java.util.ArrayList;

public abstract class Empresa {
	private String nombre;
	
	public Empresa(String nombre){
		this.nombre = nombre;
	}
	
	public abstract int cantidadEmpleados(String especialidad);
	public abstract ArrayList<Empleado> tienenEspecialidad(String especialidad);
	public abstract ArrayList<String> getEspecialidades();
	public abstract String especialidadMasElegida();
}

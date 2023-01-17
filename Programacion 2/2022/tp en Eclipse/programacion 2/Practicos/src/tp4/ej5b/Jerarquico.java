package tp4.ej5b;

import java.util.ArrayList;

public class Jerarquico extends Empleado {
	
	private ArrayList<Empleado> empleadosAcargo = new ArrayList<Empleado>();

	public Jerarquico(String cargo, String nombre, String apellido, int edad, int nroLegajo) {
		super(cargo, nombre, apellido, edad, nroLegajo);
	}

	public ArrayList<Empleado> getEmpleadosAcargo() {
		return empleadosAcargo;
	}

	public void addEmpleadoo(Empleado e) {
		this.empleadosAcargo.add(e);
	}

	@Override
	public String toString() {
		return super.toString() + "Empleados a cargo: " + this.imprimirEmpleados();
	}
	
	
	public String imprimirEmpleados() {
		
		String retor = "";
		
		for(Empleado e: this.empleadosAcargo) {
			retor += e.getNombre() + " " + e.getApellido() + ", ";
		}
		return retor;
	}
	
}

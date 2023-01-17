package tp4.ej3;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();
	
	public Empresa() {
		
	}
	
	public void addEmpleado(Empleado e) {
		this.empleados.add(e);
	}
	
	public double sueldoPorEmpleado(Empleado e) {
		
		for(Empleado emp: this.empleados) {
			
			if(emp.equals(e))
				return emp.getSalario();
		}
		return 1;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	
}
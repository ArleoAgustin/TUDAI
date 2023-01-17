package recuperatorio2020;

import java.util.ArrayList;
import java.util.Collections;

import recuperatorio2020.Comparador.Comparador;

public class Empresa {

	private ArrayList<Empleado> empleados;

	public Empresa() {
		super();
		this.empleados = new ArrayList<>();
	}
	
	public void addEmpleado(Empleado e) {
		
		this.empleados.add(e);
	}
	
	public ArrayList<Empleado> empleados(Comparador c){
		
		ArrayList<Empleado> res = new ArrayList<>();
		
		for(Empleado e: this.empleados) {
			res.addAll(e.empleadoOrdenado(c));
		}
		Collections.sort(res, c);
		return res;
	}
	
}

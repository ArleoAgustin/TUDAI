package recuperatorio2020;

import java.util.ArrayList;
import java.util.Collections;

import recuperatorio2020.Comparador.Comparador;
import recuperatorio2020.ComportamientoSueldo.CalcularSueldo;

public class EmpleadoACargo extends Empleado {
	
	private ArrayList<Empleado> personalAcargo;
	
	
	public EmpleadoACargo(String nombre, String apellido, int edad, CalcularSueldo calculador) {
		super(nombre,apellido, edad, calculador);
		this.personalAcargo = new ArrayList<>();
		
	}

	@Override
	public double getSueldo() {
		
		double aux = 0;
		
		for(Empleado e: this.personalAcargo) {
			aux += e.getSueldo();
		}
		aux += super.getCalculador().getSueldo();
		
		return aux;
	}

	@Override
	public ArrayList<String> getEspecialidad() {
		ArrayList<String> res = new ArrayList<>();
		
		if(!this.personalAcargo.isEmpty()) {
			
			for(Empleado e: this.personalAcargo) {
			
				for(String s: e.getEspecialidad()) {
					
					if(!res.contains(s))
						res.add(s);
				}
			}
		}
		return res;
	}

	public ArrayList<Empleado> getPersonalAcargo() {
		return new ArrayList<>(personalAcargo);
	}

	public void addPersonalAcargo(Empleado e) {
		this.personalAcargo.add(e);
	}

	@Override
	public ArrayList<Empleado> empleadoOrdenado(Comparador c) {
		
		ArrayList<Empleado> res = new ArrayList<>();
		
		for(Empleado e: this.personalAcargo) {
			
			
		}
		
	//	Collections.sort(res, c);
		
		return res;
	}
	
	public int cantEmpleadosAcargo() {
		
		int aux = this.personalAcargo.size();
		for(Empleado e: this.personalAcargo) {
			aux += e.cantEmpleadosAcargo();
		}
		
		return aux;
	}

	@Override
	
	public String toString() {
		return super.toString();
	}
	
	
	
	
}

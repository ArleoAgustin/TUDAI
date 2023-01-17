package recuperatorio2020;

import java.util.ArrayList;

import recuperatorio2020.ComportamientoSueldo.CalcularSueldo;

public class EmpleadoACargoEspecial extends EmpleadoACargo {
	
	private static final int maxEspecialidades = 5;
	
	public EmpleadoACargoEspecial(String nombre, String apellido, int edad, CalcularSueldo calculador) {
		super(nombre, apellido, edad, calculador);
	}
	
	public ArrayList<String> getEspecialidad() {
		
		ArrayList<String> aux = new ArrayList<>();
		
		for(int i = 0; i< super.getEspecialidad().size() && i < maxEspecialidades; i++) {
			
			aux.add(super.getEspecialidad().get(i));
		}
		return aux;
		
	}
}

package tp4.ej5b;

import java.util.ArrayList;

public class Empresa {
	
	private ArrayList<Persona> asociados = new ArrayList<Persona>();

	public Empresa() {

	}

	public ArrayList<Persona> getEmpleados() {
		return asociados;
	}

	public void addEmpleado(Persona e) {
		this.asociados.add(e);
	}
	
	public void imprimirAsociados() {
		
		for(Persona p: this.asociados) {
			System.out.println(p.toString());
		}
	}
	
}

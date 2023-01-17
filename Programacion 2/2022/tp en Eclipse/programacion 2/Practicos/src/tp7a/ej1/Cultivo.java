package tp7a.ej1;

import java.util.ArrayList;

import tp7a.ej1.comportamiento.Comportamiento;
import tp7a.ej1.comportamiento.ComportamientoNormal;

public class Cultivo {
	
	private String nombre;
	private ArrayList<Enfermedad> enfermedadesQueLoAfectan;
	
	private Comportamiento comportamiento;
	
	
	public Cultivo(String nombre) {
		
		this.nombre = nombre;
		this.enfermedadesQueLoAfectan = new ArrayList<Enfermedad>();
		this.comportamiento = new ComportamientoNormal();
	}

	
	
	public Cultivo(String nombre, Comportamiento c) {
		
		this.nombre = nombre;
		this.enfermedadesQueLoAfectan = new ArrayList<Enfermedad>();
		this.comportamiento = c;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Enfermedad> getEnfermedadesQueLoAfectan() {
		return new ArrayList<>(enfermedadesQueLoAfectan);
	}

	public void setEnfermedadesQueLoAfectan(Enfermedad e) {
		this.enfermedadesQueLoAfectan.add(e);
	}


	public void setComportamiento(Comportamiento c) {
		this.comportamiento = c;
	}
	
	
	public boolean esPermitido(Producto p) {
		return comportamiento.esPermitido(this, p);
	}
}

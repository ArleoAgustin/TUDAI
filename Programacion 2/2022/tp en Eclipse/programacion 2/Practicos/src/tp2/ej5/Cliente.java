package tp2.ej5;

import java.util.ArrayList;

public class Cliente {
	
	private String nombre;
	private boolean esFrecuente;
	private ArrayList<Turno> turnosReservados = new ArrayList<Turno>();
	
	
	public Cliente(String nombre) {
		
		this.nombre = nombre;
		this.esFrecuente = false;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public boolean isFrecuente() {
		return esFrecuente;
	}




	public ArrayList<Turno> getTurnosReservados() {
		return turnosReservados;
	}


	public void addTurno(Turno nuevoTurno) {
		this.turnosReservados.add(nuevoTurno);
	}
	
	
	
	
}
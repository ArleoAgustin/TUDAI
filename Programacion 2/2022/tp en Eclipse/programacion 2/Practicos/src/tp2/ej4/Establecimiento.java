package tp2.ej4;

import java.util.ArrayList;

public class Establecimiento {
	
	private ArrayList<Cancha> canchas = new ArrayList<Cancha>();
	private ArrayList<Turno> turnos = new ArrayList<Turno>();
	
	
	
	public Establecimiento() {

	}
	
	
	public ArrayList<Cancha> getCanchas() {
		return canchas;
	}
	
	public void addCanchas(Cancha cancha) {
		this.canchas.add(cancha);
	}
	
	public ArrayList<Turno> getTurnos() {
		return turnos;
	}
	
	public void addTurno(Turno t) {
		this.turnos.add(t);
	}
	

	
	
}

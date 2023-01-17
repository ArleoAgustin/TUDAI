package tp2.ej5;

import java.util.ArrayList;

public class Peluqueria {
	
	private ArrayList<Turno> turnos = new ArrayList<Turno>();
	private ArrayList<Peluquero> peluqueros = new ArrayList<Peluquero>();
	
	
	
	public Peluqueria() {}

/*
	public void addTurno(Turno t) {
		
		if(!this.verificarSiHayTurno(t)){
			this.turnos.add(t);
		}
	}
	*/
	/*
	public boolean verificarSiHayTurno(Turno tn) {
		
		for(Turno t: turnos) {
			t.getFecha()
		}
	}
	*/
	
	public void addTurno(Peluquero p) {
		this.peluqueros.add(p);
	}
	
		
	
}

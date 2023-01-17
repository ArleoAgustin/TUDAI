package tp2.ej4;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private boolean socio;
	private ArrayList<Turno> turnosReservados = new ArrayList<Turno>();
	private final int turnosParaSerSocio = 4;
	private final int maximoDeMeses = 2;
	
	public Usuario(String nombre) {
		
		this.nombre = nombre;
		this.socio = false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isSocio() {
		
		int turnosCumplen =0;
		
		LocalDate fechaHoy = LocalDate.now();
		
		for(Turno t: this.turnosReservados) {
		
			if((int) ChronoUnit.MONTHS.between(t.getFecha(), fechaHoy) <= this.maximoDeMeses) {
				turnosCumplen++;
			}
		}
		
		if(turnosCumplen >= this.turnosParaSerSocio)
			this.socio = true;
		else {
			this.socio = false;
		}
		
		return socio;
	}



	public ArrayList<Turno> getTurnosReservados() {
		return turnosReservados;
	}

	public void setTurno(Turno t) {
		
		this.turnosReservados.add(t);
		
	}
	
	
	
	
	
	
}
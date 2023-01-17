package tp2.ej2;

import java.util.ArrayList;

public class Reunion {
	
	private String lugar;
	private ArrayList<Participante> participantes = new ArrayList<Participante>();
	private String tema;
	private int duracion;
	private int horario;
	
	public Reunion(String lugar, String tema, int duracion, int horario) {
		
		this.lugar = lugar;
		this.tema = tema;
		this.duracion = duracion;
		this.horario = horario;
	}
	
	
	public int getHorario() {
		return horario;
	}


	public void setHorario(int horario) {
		this.horario = horario;
	}


	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Participante> getParticipantes() {
		
		ArrayList<Participante> participantes = this.participantes;
		return participantes;
	}

	public void setParticipantes(Participante p) {
		this.participantes.add(p);
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	
	
}

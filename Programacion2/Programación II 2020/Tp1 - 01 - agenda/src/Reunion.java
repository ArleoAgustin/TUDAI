
public class Reunion {
	
	private String donde;
	private String tema;
	private int horaInicio;
	private int duracion;
	private String[] participantes;
		
	public Reunion(String donde, String tema, int horaInicio, int duracion, String participantes) {
		this.donde = donde;
		this.tema = tema;
		this.horaInicio = horaInicio;
		this.duracion = duracion;
		this.participantes = participantes(participantes);
	}
	
	/*
	 * 
	 * Preguntar ai un particiapante de una reunion esta an la lista de contactos
	 * 
	 * */
	
	public boolean participanteAgendado (String contactoNombre) {
		boolean contactoEncontrado = false;
		for (String participante : participantes) {
			if (contactoEncontrado == false) {
				if (participante == contactoNombre){
					contactoEncontrado = true;
				}
			}
		}
		return contactoEncontrado;
	}
	
	public void anadirContactoReunion(String contacto) {
		String participantes = "";
		for (int i = 0; i < getParticipantes().length; i++) {
			participantes += (getParticipantes()[i])+", ";
		}
		setParticipantes(participantes(participantes));
	}
	
	private String[] participantes(String participantes) {
		return (participantes.split(", "));
	}

	public String getDonde() {
		return donde;
	}

	public void setDonde(String donde) {
		this.donde = donde;
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

	
	public String[] getParticipantes() {
		return participantes;
	}


	public void setParticipantes(String []participantes) {
		this.participantes = participantes;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	
}

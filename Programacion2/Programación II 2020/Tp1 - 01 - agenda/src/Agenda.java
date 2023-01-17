import java.util.ArrayList;

public class Agenda {
	
	 private Reunion reunion1;
	private ArrayList<Contacto> contactos = new ArrayList<Contacto>();
	private ArrayList<Reunion> reuniones = new ArrayList<Reunion>();

	public void agregarReunion(String lugar, String tema, int tiempo,
			String nombre1, String nombre2) {
		reunion1 = new Reunion(lugar, tema, tiempo, nombre1, nombre2);
	}
	
	public void detectarConflictosHorario() {
		for (int i = 0; i < reuniones.size(); i++) {
			for (int j = i + 1; i < reuniones.size(); j++) {
				detectarConflictoHorario(reuniones.get(i), reuniones.get(j));
			}
		}
	}
	
	public boolean detectarConflictoHorario(Reunion reunion1, Reunion reunion2) {
		
		if (!(reunion1.getHoraInicio() <= reunion2.getHoraInicio() || reunion1
				.getHoraInicio() >= (reunion2.getDuracion() + reunion2
				.getHoraInicio()))) {
			System.out
					.println("Hay conflicto horario entre la reunion que se realizara en "
							+ reunion1.getDonde()
							+ "y la reunion que se raliara en "
							+ reunion2.getDonde());
		}
		return !(reunion1.getHoraInicio() <= reunion2.getHoraInicio() || reunion1
				.getHoraInicio() >= (reunion2.getDuracion() + reunion2
				.getHoraInicio()));
				
	}
	
	public boolean participantesContacto() {
		for (Contacto contacto : getAsistentes()) {
			for (Reunion reunion : getReuniones()) {
				reunion.participanteAgendado(contacto.getNombre());
			}

		}
		return true;
	}
	
	public String anadirContactoReunion(String contacto) {
		
	}
	
	public boolean participanteContacto(String nombre) {
			for (Reunion reunion : getReuniones()) {
				reunion.participanteAgendado(nombre);

		}
		return true;
	}

	public ArrayList<Contacto> getAsistentes() {
		return contactos;
	}

	public void setAsistentes(ArrayList<Contacto> asistentes) {
		this.contactos = asistentes;
	}

	public ArrayList<Reunion> getReuniones() {
		return reuniones;
	}

	public void setReuniones(ArrayList<Reunion> reuniones) {
		this.reuniones = reuniones;
	}

}

import java.util.ArrayList;


public class  ColaDeRelizadorDeTareas extends ColaDeTareasYRelizadorDeTareas{
	
	private ArrayList<RealizadorDeTareas> realizadoresDeTareas;
	
	public ColaDeRelizadorDeTareas() {
		realizadoresDeTareas = new ArrayList<RealizadorDeTareas>();
	}

	public void addTareaORealizadoresDeTareas(TareayRelizadorDeTareas t) {
		try {
			RealizadorDeTareas r = (RealizadorDeTareas) t;
		realizadoresDeTareas.add(r);
		} catch (Exception e) {
			
		}
	}

	public void removeProcesador(RealizadorDeTareas realizadorDeTareas) {
		realizadoresDeTareas.add(realizadorDeTareas);
	}


	public ArrayList<RealizadorDeTareas> getArr() {
		return realizadoresDeTareas;
	}


	public void setRealizadoresDeTareas(
			ArrayList<RealizadorDeTareas> realizadoresDeTareas) {
		this.realizadoresDeTareas = realizadoresDeTareas;
	}

}

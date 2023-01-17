import java.util.ArrayList;


public abstract class ColaDeTareasYRelizadorDeTareas {

	public boolean Ordenar(ArrayList<TareayRelizadorDeTareas> tareaORealizadoresDeTareas){
		ColaDeTareasYRelizadorDeTareas tareaORealizadoresDeTareas = this.getArr();
		TareayRelizadorDeTareas procesoAux = new RealizadorDeTareas();
		ArrayList<TareayRelizadorDeTareas> arrAux = new ArrayList<TareayRelizadorDeTareas>();
		for (int i = 0; i < tareaORealizadoresDeTareas.size(); i++) {
			for (TareayRelizadorDeTareas procesador : tareaORealizadoresDeTareas) {
				if(procesador.sosMayor(procesoAux)) {
					procesoAux = procesador;
				} 
			}
			tareaORealizadoresDeTareas.addTareaORealizadoresDeTareas(procesoAux);
			arrAux.add(procesoAux);
		}
		tareaORealizadoresDeTareas = arrAux;
	}
	
	public abstract void addTareaORealizadoresDeTareas(TareayRelizadorDeTareas t);
}

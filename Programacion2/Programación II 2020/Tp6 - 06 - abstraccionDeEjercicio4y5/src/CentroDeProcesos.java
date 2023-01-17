import java.util.ArrayList;

public class CentroDeProcesos {

	private ArrayList<RealizadorDeTareas> procesadores;
	private ArrayList<Tarea> procesos;
	private TareayRelizadorDeTareas ordenador;
	
	private void ordenarProcesadores() {
		TareayRelizadorDeTareas procesoAux = new RealizadorDeTareas();
		ArrayList<RealizadorDeTareas> arrAux = new ArrayList<RealizadorDeTareas>();
		for (int i = 0; i < procesadores.size(); i++) {
			for (RealizadorDeTareas procesador : procesadores) {
				if(procesador.sosMayor(procesoAux)) {
					procesoAux = procesador;
				} 
			}ordenarProcesos(new RealizadorDeTareas());
			procesadores.remove(procesoAux);
			arrAux.add(procesoAux);
		}
	}	
	
	private void ordenarProcesos(TareayRelizadorDeTareas e) {
		Tarea procesoAux = new Tarea();
		ArrayList<Tarea> arrAux = new ArrayList<Tarea>();
		for (int i = 0; i < procesadores.size(); i++) {
			for (Tarea procesador : procesos) {
				if(procesador.sosMayor(procesoAux)) {
					procesoAux = procesador;
				} 
			}
			procesadores.remove(procesoAux);
			arrAux.add(procesoAux);
		}
	}
}

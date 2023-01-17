import java.util.ArrayList;

public class Congreso {

	private ArrayList<Evaluador> evaludores;
	private ArrayList<Trabajo> trabajos;
	private ArrayList<String> temasGenerales;
	
	public Congreso() {
		evaludores = new ArrayList<Evaluador>();
		trabajos = new ArrayList<Trabajo>();
		temasGenerales = new ArrayList<String>();
	}

	
	public void addEvaludor(Evaluador evaludor) {
		evaludores.add(evaludor);
	}
	
	public void addTrabjo(Trabajo trabajo) {
		trabajos.add(trabajo);
	}
	
	public void addRemasGenerales(String tema) {
		temasGenerales.add(tema);
	}
}

import java.util.ArrayList;

public class Evaluador {
	
	private ArrayList<String> temasConocidos;
	private ArrayList<Trabajo> trabajos;
	
	public Evaluador() {
		temasConocidos = new ArrayList<String>();
		trabajos = new ArrayList<Trabajo>();
	}

	public boolean seirveParaTrabajo(Trabajo trabajo) {
		return trabajo.sirveTrabajador(this);
	}
	
	public boolean soyTrabajadorExperto(ArrayList<String> temasGenerales) {
		for (String tema : temasGenerales) {
			if (!temasConocidos.contains(tema)) {
				return false;
			}
		}
		return true;
	}


	public void addTemasConocidos(String tema) {
		temasConocidos.add(tema);
	}
	
	public void addTrabajo(Trabajo trabajo) {
		trabajos.add(trabajo);
	}
	
	
	public ArrayList<String> getTemasConocidos() {
		return temasConocidos;
	}

	public void setTemasConocidos(ArrayList<String> temasConocidos) {
		this.temasConocidos = temasConocidos;
	}
}

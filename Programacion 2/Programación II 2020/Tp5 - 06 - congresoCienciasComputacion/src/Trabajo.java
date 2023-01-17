import java.util.ArrayList;


public class Trabajo {
	
	protected ArrayList<String> palabrasClave;
	
	public Trabajo() {
		palabrasClave = new ArrayList<String>();
	}
	
	public boolean sirveTrabajador(Evaluador trabajador) {
		for (String palabra : palabrasClave) {
			if (!trabajador.getTemasConocidos().contains(palabra)) {
				return false;
			}
		}
		return true;
	}
	
	public void addPalabraClave(String palabra) {
		palabrasClave.add(palabra);
	}

	public ArrayList<String> getPalabrasClave() {
		return new ArrayList<String> (palabrasClave);
	}

	public void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = (palabrasClave);
	}
}

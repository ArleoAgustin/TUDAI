
public class Poster extends Trabajo{
	
	public Poster() {
		super();
	}
	
	public boolean sirveTrabajador(Evaluador trabajador) {
		for (String palabra : palabrasClave) {
			if (trabajador.getTemasConocidos().contains(palabra)) {
				return true;
			}
		}
		return false;
	}
}

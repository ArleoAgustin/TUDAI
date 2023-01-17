package tp5.ej6;

public class Poster extends Trabajo {

	public Poster() {
		super("Poster");
		
	}
	
	@Override
	public boolean esApto(Evaluador e) {
		for (String palabra : super.getPalabrasClaves()) {
			if (e.getPalabrasClaves().contains(palabra)) {
				return true;
			}
		}
		return false;
	}

}

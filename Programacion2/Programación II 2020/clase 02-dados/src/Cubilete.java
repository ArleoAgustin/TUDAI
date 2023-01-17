public class Cubilete {

	private Dado d1;
	private Dado d2;
	
	public Cubilete() {
		d1 = new Dado();
		d2 = new Dado();
	}
	
	public Cubilete(int caras) {
		d1 = new Dado(caras);
		d2 = new Dado(caras);
	}
	
	public Cubilete(int caras1, int caras2) {
		d1 = new Dado(caras1);
		d2 = new Dado(caras2);
	}
	
	
	public int tirar() {
		return d1.tirar() + d2.tirar();
	}
	
	public int ultimaTirada() {
		return d1.getCara() + d2.getCara();
	}
	
}

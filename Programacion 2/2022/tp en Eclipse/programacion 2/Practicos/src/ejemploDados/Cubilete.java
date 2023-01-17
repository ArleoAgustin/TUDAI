package ejemploDados;

public class Cubilete {
	
	private Dado d1 = new Dado();
	private Dado d2 = new Dado();
	
	public Cubilete() {
		
	}

	public void tirar() {
		
		d1.tirar();
		d2.tirar();
	}
	
	public int getValor() {
		
		return d1.getUltimoValor() + d2.getUltimoValor();
	}
	

}

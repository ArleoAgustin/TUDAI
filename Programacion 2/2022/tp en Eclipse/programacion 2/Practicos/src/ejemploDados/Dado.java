package ejemploDados;

public class Dado {

	private int ultimoValor;

	public Dado() {
		
	}
	
	public void tirar() {
		
		this.ultimoValor = (int)(Math.random()*6)+1;
		
	}
	

	public int getUltimoValor() {
		return ultimoValor;
	}
}

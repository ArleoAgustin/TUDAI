public class Dado {
	
	private int cara;
	private int cantidadDeCaras;
	
	public Dado (){
		cantidadDeCaras = 6;
		tirar();
	}
	
	public Dado(int cantidadCaras) {
		this.setCantidadDeCaras(cantidadCaras);
		tirar();
	}
	
	public int tirar () {
		cara = (int) ((Math.random()*cantidadDeCaras)+1);
		return cara;
	}
	
	public int getCantidadDeCaras(){
		return cantidadDeCaras;
	}
	
	public int getCara(){
		return cara;
	}
	
	public void setCantidadDeCaras (int nn){
		if (nn > 0) {
			cantidadDeCaras = nn;
		}
		tirar();
	}
}

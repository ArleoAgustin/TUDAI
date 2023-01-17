
public class Impuesto {
	
	private int valorImpuesto;
	
	public Impuesto (){
		valorImpuesto = 2500;
	}
	public Impuesto (int valor){
		valorImpuesto = valor;
	}

	public int getValorImpuesto() {
		return valorImpuesto;
	}

	public void setValorImpuesto(int valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
}

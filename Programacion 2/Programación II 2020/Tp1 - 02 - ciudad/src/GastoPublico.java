
public class GastoPublico {
	
	private int gasto;
	
	public GastoPublico (){
		gasto = 12500;
	}
	
	public GastoPublico (int valor){
		gasto = valor;
	}

	public int getGasto() {
		return gasto;
	}

	public void setGasto(int gasto) {
		this.gasto = gasto;
	}

}

import java.util.HashMap;


public class Ciudad_no {
	
	//private boolean poblacionMayorCienmil;
	GastoPublico gasto;
	private Impuesto imp1;
	private Impuesto imp2;
	private Impuesto imp3;
	private Impuesto imp4;
	private Impuesto imp5;
	private HashMap<Integer, Impuesto> impuestos = new HashMap<Integer, Impuesto>();
	
	public Ciudad_no () {
		imp1 = new Impuesto();
		imp2 = new Impuesto();
		imp3 = new Impuesto();
		imp4 = new Impuesto();
		imp5 = new Impuesto();
		gasto = new GastoPublico();
		impuestos.put(1, imp1);
		impuestos.put(2, imp2);
		impuestos.put(3, imp3);
		impuestos.put(4, imp4);
		impuestos.put(5, imp5);
		//poblacionMayorCienmil = poblacion;
	}
	
	public Ciudad_no (int valor1, int valor2, int valor3, int valor4, int valor5, int gasto1) {
		imp1 = new Impuesto(valor1);
		imp2 = new Impuesto(valor2);
		imp3 = new Impuesto(valor3);
		imp4 = new Impuesto(valor4);
		imp5 = new Impuesto(valor5);
		gasto = new GastoPublico(gasto1);
		impuestos.put(1, imp1);
		impuestos.put(2, imp2);
		impuestos.put(3, imp3);
		impuestos.put(4, imp4);
		impuestos.put(5, imp5);
		
		//poblacionMayorCienmil = poblacion;
	}
	
	public int valorImpuestos (){
		int valorTotal = 0;
		for (Impuesto imp:impuestos.values()) {
			valorTotal += imp.getValorImpuesto();
		}
		return  valorTotal;
	}
	
	public boolean getDeficit (){
		if (gasto.getGasto() - valorImpuestos() <0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private int valorImpuesto(int i){
		return  (int)(Math.random()*3000)+1;
	}
}

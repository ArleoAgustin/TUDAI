import java.util.HashMap;


public class Ciudad {
	
	//private boolean poblacionMayorCienmil;
	private int gasto;
	private int imp1;
	private int imp2;
	private int imp3;
	private int imp4;
	private int imp5;
	private HashMap<String, Integer> impuestos = new HashMap<String, Integer>();
	
	public Ciudad () {
		imp1 = valorAleatorio();
		imp2 = valorAleatorio();
		imp3 = valorAleatorio();
		imp4 = valorAleatorio();
		imp5 = valorAleatorio();
		gasto = ((valorAleatorio())*5);
		impuestos.put("luz", imp1);
		impuestos.put("gas", imp2);
		impuestos.put("agua", imp3);
		impuestos.put("intenet", imp4);
		impuestos.put("cable", imp5);
		//poblacionMayorCienmil = poblacion;
	}
	
	public int valorImpuestos (){
		int valorTotal = 0;
		for (int imp: impuestos.values()) {
			valorTotal += imp;
		}
		return  valorTotal;
	}
	
	public boolean getDeficit (){
		if (gasto - valorImpuestos() <0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private int valorAleatorio(){
		return  (int)(Math.random()*3000)+1;
	}
}

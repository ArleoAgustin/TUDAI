package tp5.ej4;

public class Ciudad {
	
	private double imp1, imp2, imp3, imp4, imp5, gastosRealizados;
	//protected ArrayList<Contribuyente> contribuyentes = new ArrayList<Contribuyente>();
	
	public Ciudad(double imp1, double imp2, double imp3, double imp4, double imp5) {
	
		this.imp1 = imp1;
		this.imp2 = imp2;
		this.imp3 = imp3;	
		this.imp4 = imp4;
		this.imp5 = imp5;
	}
	
	
	public double gasto() {
		
		return this.gastosRealizados;
	}
	
	public boolean gastaMasqueRecauda() {
		
		if(this.imp1+this.imp2+this.imp3+this.imp4+this.imp5 < this.gastosRealizados) {
			return true;
		}
		return false;
	}
	
}

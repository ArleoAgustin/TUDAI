package tp8.ej1;

public class Cancha {

	private static int contador =1;
	private int id;
	private double costo;
	
	public Cancha(double costo) {
		this.id = contador++;
		this.costo = costo;
	}
	
	
	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Cancha.contador = contador;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}
	
	
	
	
}

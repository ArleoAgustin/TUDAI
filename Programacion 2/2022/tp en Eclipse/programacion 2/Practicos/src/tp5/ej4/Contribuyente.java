package tp5.ej4;

public class Contribuyente {
	
	private String nombre;
	static int cod_id;
	private double monto;
	
	public Contribuyente(String nombre, double monto) {
		
		this.nombre = nombre;
		cod_id++;
		this.monto = monto;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static int getCod_id() {
		return cod_id;
	}
	public static void setCod_id(int cod_id) {
		Contribuyente.cod_id = cod_id;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	
}

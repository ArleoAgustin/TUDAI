package recuperatorio2020.ComportamientoSueldo;

public abstract class CalcularSueldo {
	
	protected int horasExtrasTrabajadas;
	protected double precioPorHoraExtra;
	
	public CalcularSueldo() {}

	public CalcularSueldo(int horasExtrasTrabajadas, double precioPorHorasExtras) {
		this.horasExtrasTrabajadas = horasExtrasTrabajadas;
		this.precioPorHoraExtra = precioPorHorasExtras;
	}
	
	public abstract double getSueldo();
	
	public boolean trabajoExtra() {
		return this.horasExtrasTrabajadas > 0;
	}
	
	public double calcularHorasExtras() {
		
		return this.horasExtrasTrabajadas * this.precioPorHoraExtra;
	}
}

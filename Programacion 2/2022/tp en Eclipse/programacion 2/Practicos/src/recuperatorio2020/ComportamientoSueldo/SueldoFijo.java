package recuperatorio2020.ComportamientoSueldo;

public class SueldoFijo extends CalcularSueldo {
	
	private double sueldoFijo;

	public SueldoFijo(int horasExtrasTrabajadas, double precioPorHorasExtras, double sueldoFijo) { 
		super(horasExtrasTrabajadas, precioPorHorasExtras);
		this.sueldoFijo = sueldoFijo;
		}
	
	public SueldoFijo(double sueldoFijo){
		
		this.sueldoFijo = sueldoFijo;
	}


	@Override
	public double getSueldo() {
		
		if(this.trabajoExtra())
			return super.calcularHorasExtras() + this.sueldoFijo;
		
		return this.sueldoFijo;
	}

}

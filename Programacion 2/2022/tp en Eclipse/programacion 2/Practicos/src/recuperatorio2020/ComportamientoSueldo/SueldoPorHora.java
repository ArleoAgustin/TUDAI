package recuperatorio2020.ComportamientoSueldo;

public class SueldoPorHora extends CalcularSueldo {

	private int cantHorasTrabajadas;
	private double precioPorHora;
	


	public SueldoPorHora(double precioPorHora, int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.precioPorHora = precioPorHora;
	}

	
	public SueldoPorHora(int horasExtrasTrabajadas, double precioPorHorasExtras, double precioPorHora, int cantHorasTrabajadas) {
		super(horasExtrasTrabajadas, precioPorHorasExtras);
		
		this.cantHorasTrabajadas = cantHorasTrabajadas;
		this.precioPorHora = precioPorHora;
	}

	@Override
	public double getSueldo() {
		
		if(this.trabajoExtra()) 
			return super.calcularHorasExtras() + this.cantHorasTrabajadas * this.precioPorHora;
		
		return this.cantHorasTrabajadas * this.precioPorHora;
	}

}


public class EmpleadoPorHoras extends Empleado{
	
	private int horasTrabajdas;
	private int montoPorHoraTrabajada;
	
	public EmpleadoPorHoras (String nombre, int horasTrabajdas) {
		super(nombre);
		this.montoPorHoraTrabajada = horasTrabajdas;
		this.horasTrabajdas = 1700;
	}
	
	public double calcularSueldo() {
		return (super.getMontoFijoSemanal()/2 + montoPorHoraTrabajada * horasTrabajdas);
	}

	public int getHorasTrabajdas() {
		return horasTrabajdas;
	}
	
	public void setHorasTrabajdas(int horasTrabajdas) {
		this.horasTrabajdas = horasTrabajdas;
	}

	public int getMontoPorHoraTrabajada() {
		return montoPorHoraTrabajada;
	}

	public void setMontoPorHoraTrabajada(int montoPorHoraTrabajada) {
		this.montoPorHoraTrabajada = montoPorHoraTrabajada;
	}
}

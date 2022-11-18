
public class EmpleadoPorComision extends Empleado{
	
	private double valorVentas;
	private double porcentaje = 0.33;
	
	public EmpleadoPorComision(String nombre, double valorVentas) {
		super(nombre);
		this.valorVentas = valorVentas;
	}
	
	public double calcularSueldo() {
		return (super.getMontoFijoSemanal()/2 + (valorVentas * porcentaje));
	}

	public double getValorVentas() {
		return valorVentas;
	}

	public void setValorVentas(double valorVentas) {
		this.valorVentas = valorVentas;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	
}

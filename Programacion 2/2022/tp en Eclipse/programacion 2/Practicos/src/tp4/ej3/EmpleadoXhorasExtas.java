package tp4.ej3;

public class EmpleadoXhorasExtas extends Empleado {
	
	private int cantHorasTrabajadas;
	private final int sueldoXHora = 1000; 
	
	public EmpleadoXhorasExtas(double salario, int cantHorasTrabajadas) {
		super(salario);
		this.cantHorasTrabajadas = cantHorasTrabajadas;

	}
	
	public double getSalario() {
		
		return super.getSalario()+ this.cantHorasTrabajadas * sueldoXHora;
	}

	public int getCantHorasTrabajadas() {
		return cantHorasTrabajadas;
	}

	public void setCantHorasTrabajadas(int cantHorasTrabajadas) {
		this.cantHorasTrabajadas = cantHorasTrabajadas;
	}

	public int getSueldoXHora() {
		return sueldoXHora;
	}
	
	

	
}

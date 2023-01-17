
public class Empleado{
	
	private String nombre;
	private  double sueldo;
	final private double montoFijoSemanal;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.sueldo = calcularSueldo();
		montoFijoSemanal = 400000;
	}
	
	public double calcularSueldo() {
		return montoFijoSemanal;
	}
	
	public void cuantoCobro() {
		System.out.println("El empleado "+getNombre()+" cobra "+ this. calcularSueldo());
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getMontoFijoSemanal() {
		return montoFijoSemanal;
	}
	
	
}

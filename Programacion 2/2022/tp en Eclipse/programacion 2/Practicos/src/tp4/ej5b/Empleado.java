package tp4.ej5b;

public class Empleado extends Persona {
	
	private int nroLegajo;

	public Empleado(String cargo, String nombre, String apellido, int edad, int nroLegajo) {
		super(cargo, nombre, apellido, edad);
		this.nroLegajo = nroLegajo;
	}

	public int getNroLegajo() {
		return nroLegajo;
	}

	public void setNroLegajo(int nroLegajo) {
		this.nroLegajo = nroLegajo;
	}

	@Override
	public String toString() {
		return super.toString() + "Numero de legajo: " + nroLegajo + "\n";
	}
	
	
}

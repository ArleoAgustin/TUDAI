package tp9_2020.ej1;

public abstract class Elemento {
	
	private String nombre;

	public Elemento(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public abstract int getCantHabitantes();
	public abstract double getSuperficie();
	public abstract double getIngresos();
	
	public  double densidadDePoblacion() {
		return this.getCantHabitantes() / this.getSuperficie();
	}
}

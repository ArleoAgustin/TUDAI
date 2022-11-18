
public class SimpleTerritory extends Territory implements Comparable<SimpleTerritory>{
	private String nombre;
	private double superficie;
	private double cantidadDeHabitantes;
	private double montoTotalDeIngresos;
	
	public SimpleTerritory(String nombre, double superficie, double cantidadDeHabitantes, double montoTotalDeIngresos) {
		this.nombre = nombre;
		this.superficie = superficie;
		this.cantidadDeHabitantes = cantidadDeHabitantes;
		this.montoTotalDeIngresos = montoTotalDeIngresos;
	}

	@Override
	public double getCantidadDeHabitantes() {
		return this.cantidadDeHabitantes;
	}

	@Override
	public double getSuperficeTotalDeTerritorio() {
		return superficie;
	}

	@Override
	public double getCantidadTotalDeSueldo() {
		return montoTotalDeIngresos;
	}

	@Override
	public int compareTo(SimpleTerritory comarca) {
		return this.getNombre().compareTo(comarca.getNombre());
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}

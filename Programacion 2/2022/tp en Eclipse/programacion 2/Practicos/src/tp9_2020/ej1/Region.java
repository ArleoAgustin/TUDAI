package tp9_2020.ej1;

public class Region extends Elemento {
	
	private double superficie;
	private int cantHabitantes;
	private double montoDeIngresos;
	
	public Region(String nombre, double superficie, int cantHabitantes, double montoDeIngresos) {
		super(nombre);
		this.superficie = superficie;
		this.cantHabitantes = cantHabitantes;
		this.montoDeIngresos = montoDeIngresos;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getCantHabitantes() {
		return cantHabitantes;
	}

	public void setCantHabitantes(int cantHabitantes) {
		this.cantHabitantes = cantHabitantes;
	}

	public void setMontoDeIngresos(double montoDeIngresos) {
		this.montoDeIngresos = montoDeIngresos;
	}

	@Override
	public double getIngresos() {
		
		return this.montoDeIngresos / this.getCantHabitantes();
	}


	
}

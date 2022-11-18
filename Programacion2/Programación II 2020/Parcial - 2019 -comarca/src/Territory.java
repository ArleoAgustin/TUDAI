
public abstract class Territory {
	public abstract double getCantidadDeHabitantes();
	public abstract double getSuperficeTotalDeTerritorio();
	public abstract double getCantidadTotalDeSueldo();
	
	public double getIngresoPercapita() {
		return this.getCantidadTotalDeSueldo()/this.getCantidadDeHabitantes();
	}
	
	public double getDensidadDePoblacion() {
		return this.getSuperficeTotalDeTerritorio()/this.getCantidadDeHabitantes();
	}
}

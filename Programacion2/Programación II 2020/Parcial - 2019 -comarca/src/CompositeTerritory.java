import java.util.ArrayList;

public class CompositeTerritory extends Territory{
	private ArrayList<Territory> territories;

	public CompositeTerritory() {
		this.territories = new ArrayList<Territory>();
	}

	@Override
	public double getCantidadDeHabitantes() {
		double aux = 0;
		for (Territory territory : territories) {
			aux += territory.getCantidadDeHabitantes();
		}
		return aux;
	}

	@Override
	public double getSuperficeTotalDeTerritorio() {
		double aux = 0;
		for (Territory territory : territories) {
			aux += territory.getSuperficeTotalDeTerritorio();
		}
		return aux;
	}

	@Override
	public double getCantidadTotalDeSueldo() {
		double aux = 0;
		for (Territory territory : territories) {
			aux += territory.getCantidadTotalDeSueldo();
		}
		return aux;
	}
	
	public void addTerritoy(Territory t) {
		this.territories.add(t);
	}
}

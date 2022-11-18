import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Nursery {
	private ArrayList<Plant> plants;
	
	public Nursery() {
		plants = new ArrayList<Plant>();
	}
	
	public ArrayList<Plant> getPlants(Criterion c) {
		ArrayList<Plant> aux = new ArrayList<Plant>();
		for (Plant p : plants) {
			if(c.satisfies(p)) {
				aux.add(p);
			}
		}
		return aux;
	}
	
	public ArrayList<Plant> getOrderedPlants(Criterion cri, Comparator<Plant> com) {
		ArrayList<Plant> aux = this.getPlants(cri);
		Collections.sort(aux, com);
		return aux;
	}

	public void addPlant(Plant p) {
		plants.add(p);
		
	}
}

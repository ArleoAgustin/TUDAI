import java.util.Comparator;

public class ComparatorByClass implements Comparator<Plant>{
	@Override
	public int compare(Plant p1, Plant p2) {
		return p1.getClassOfPlant().compareTo(p2.getClassOfPlant());
	}
}

import java.util.Comparator;

public class ComparatorByFamily implements Comparator<Plant>{
	@Override
	public int compare(Plant p1, Plant p2) {
		return p1.getFamily().compareTo(p2.getFamily());
	}
}
import java.util.Comparator;

public class CompartorByScitificName implements Comparator<Plant>{
	@Override
	public int compare(Plant p1, Plant p2) {
		return p1.getSctificName().compareTo(p2.getSctificName());
	}
}

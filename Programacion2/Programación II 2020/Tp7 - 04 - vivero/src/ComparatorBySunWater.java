import java.util.Comparator;

public class ComparatorBySunWater implements Comparator<Plant>{
	@Override
	public int compare(Plant p1, Plant p2) {
		int diff = p1.getRequirementSun() - p2.getRequirementSun();
		if (diff != 0) {
			return diff;
		} else {
			return p1.getRequirementWater() - p2.getRequirementWater();
		}
	}
}

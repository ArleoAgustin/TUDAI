import java.util.Comparator;

public class ComparatorByWaterRequirement implements Comparator<Plant>{

	@Override
	public int compare(Plant p1, Plant p2) {
		return p1.getRequirementWater() - p2.getRequirementWater();
	}
}
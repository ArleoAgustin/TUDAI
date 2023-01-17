
public class CriterionByRequirementWaterHigher extends Criterion {
	private int requirement;
	
	public CriterionByRequirementWaterHigher(int requirement) {
		this.requirement = requirement;	
	}
	
	public boolean satisfies(Plant p) {
		return p.getRequirementWater() > (requirement);
	}

	public int getRequirement() {
		return requirement;
	}

	public void setRequirement(int requirement) {
		this.requirement = requirement;
	}
}
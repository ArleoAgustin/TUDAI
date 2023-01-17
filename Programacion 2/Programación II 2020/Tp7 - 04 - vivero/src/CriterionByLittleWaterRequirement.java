
public class CriterionByLittleWaterRequirement extends Criterion {
	private CriterionByRequirementWaterHigher waterRequirement;
	
	public CriterionByLittleWaterRequirement() {
		waterRequirement = new CriterionByRequirementWaterHigher(2);
	}

	@Override
	public boolean satisfies(Plant p) {
		return waterRequirement.satisfies(p);
	}
}

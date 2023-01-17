
public class CriterionNot extends Criterion {
	private Criterion c;
	
	public CriterionNot(Criterion c) {
		this.c = c;
	}

	@Override
	public boolean satisfies(Plant p) {
		return !c.satisfies(p);
	}
}

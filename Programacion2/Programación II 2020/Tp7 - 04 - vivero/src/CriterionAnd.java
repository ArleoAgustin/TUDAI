
public class CriterionAnd extends Criterion {
	private Criterion c1;
	private Criterion c2;
	
	public CriterionAnd(Criterion c1, Criterion c2) {
		this.c1 = c1;	
		this.c2 = c2;	
	}

	@Override
	public boolean satisfies(Plant p) {
		return c1.satisfies(p)&&c2.satisfies(p);
	}
}
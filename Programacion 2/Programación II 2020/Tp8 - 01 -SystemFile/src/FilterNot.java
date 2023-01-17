
public class FilterNot extends Filter{
	private Filter f;
	
	public FilterNot(Filter f) {
		this.f = f;
	}

	@Override
	public boolean filtrate(SystemFileElement sf) {
		return !f.filtrate(sf);
	}
}

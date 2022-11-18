
public class FilterAnd extends Filter{
	private Filter f1;
	private Filter f2;
	
	public FilterAnd(Filter f1, Filter f2) {
		this.f1 = f1;
		this.f2 = f2;
	}

	@Override
	public boolean filtrate(SystemFileElement sf) {
		return f1.filtrate(sf)&&f2.filtrate(sf);
	}
}

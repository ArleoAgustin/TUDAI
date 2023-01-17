
public class FilterByPresent extends Filter{
	private String present;

	public FilterByPresent(String present) {
		super();
		this.present = present;
	}

	@Override
	public boolean filtrate(Letter letter) {
		return letter.containsPresent(present);
	}

}


public class FilterByValueGreater extends Filter{
	private double value;
	
	public FilterByValueGreater(double value) {
		super();
		this.value = value;
	}
	@Override
	public boolean filtrate(Expense expense) {
		return expense.getExpenses() > value;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
}

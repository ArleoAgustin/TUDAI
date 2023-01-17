
public class FilterByCharacteristic extends Filter{
	private String name;
	@SuppressWarnings("rawtypes")
	private Comparable characteristic;
	
	@SuppressWarnings("rawtypes")
	public FilterByCharacteristic(String name,  Comparable characteristic) {
		super();
		this.name = name;
		this.characteristic = characteristic;
	}

	@Override
	public boolean filtrate(Expense expense) {
		return expense.constainsCharacteristics(name) && expense.compareToCharacteristics(name, characteristic);
	}
}
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Expense {
	@SuppressWarnings("rawtypes")
	protected HashMap<String, Comparable> characteristics;
	private static int counter = 0;
	private int id;
	 
	@SuppressWarnings("rawtypes")
	public Expense() {
		this.characteristics = new HashMap<String, Comparable>();
		this.id = counter;
		counter++;
	}
	 
	public abstract double getExpenses(); 
	 public abstract double getExpenses(Filter f); 
	 public abstract ArrayList<Expense> getExpensesList(Filter f); 
	 @SuppressWarnings("rawtypes")
	 public abstract ArrayList<Expense> hasCharacteristic(String name, Comparable c2);	
	 public abstract LocalDate getDate();
	 
	 @SuppressWarnings("rawtypes")
	protected void addCharacteristic(String name, Comparable characteristic) {
		 this.characteristics.put(name, characteristic);
	 }

	 protected boolean constainsCharacteristics(String name) {
		return this.characteristics.containsKey(name);
	 }
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) 
	protected boolean compareToCharacteristics(String name, Comparable c) {
		return this.characteristics.get(name).compareTo(c) == 0;
	 }
	
	public String toString() {
		String aux = "\n"+id+" Expend: ";
		for (String c : characteristics.keySet()) {
			aux += "\n	· "+c+": "+characteristics.get(c);
 		}return aux;
	}
}

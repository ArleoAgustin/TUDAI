import java.time.LocalDate;
import java.util.ArrayList;

public class SimpleExpense extends Expense{
	 private double expense;
	 private LocalDate date;
	 
	 public SimpleExpense() {
		 this.expense = 0;
		 date = LocalDate.now();
	 }

	 public SimpleExpense(double expence) {
		 this.expense = expence;
		 date = LocalDate.now();
	 }
	 
	 public SimpleExpense(double expence, String dateString) {
		 this.expense = expence;
		 date = LocalDate.parse(dateString);
	 }

	@Override
	public double getExpenses() {
		return this.expense;
	}

	@Override
	public double getExpenses(Filter f) {
		if (f.filtrate(this)) {
			return this.getExpenses();
		}
		return 0;
	}

	@Override
	public ArrayList<Expense> getExpensesList(Filter f) {
		ArrayList<Expense> aux = new ArrayList<Expense>();
		if (f.filtrate(this)) {
			aux.add(this);
		}
		return aux;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public ArrayList<Expense> hasCharacteristic(String name, Comparable c) {
		ArrayList<Expense> aux = new ArrayList<Expense>();
		if (super.constainsCharacteristics(name) && super.compareToCharacteristics(name, c)) {
			aux.add(this); 
		}
		return aux;
	}
	public LocalDate getDate() {
		return date;
	}
}

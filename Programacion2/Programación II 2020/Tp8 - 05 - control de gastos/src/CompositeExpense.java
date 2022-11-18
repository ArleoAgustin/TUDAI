import java.time.LocalDate;
import java.util.ArrayList;

public class CompositeExpense extends Expense{
	 protected ArrayList<Expense> expenses;
	 
	public CompositeExpense() {
		super();
		this.expenses = new  ArrayList<Expense>();
	}

	@Override
	public double getExpenses() {
		double aux = 0;
		for (Expense expense : expenses) {
			aux += expense.getExpenses();
		}
		return aux;
	}

	@Override
	public double getExpenses(Filter f) {
		double aux = 0;
		for (Expense expense : expenses) {
				aux += expense.getExpenses(f);
		}
		return aux;
	}

	@Override
	public ArrayList<Expense> getExpensesList(Filter f) {
		ArrayList<Expense> aux = new ArrayList<Expense>();
		if (f.filtrate(this)) {
			aux.add(this);
		} else {
			for (Expense expense : expenses) {
				if (expense.getExpensesList(f) != null) {
					aux.addAll(expense.getExpensesList(f));
				}
				if (!aux.isEmpty()) {
					aux.add(this);
				}
			}
		}
		return aux;
	}
	
	@Override
	@SuppressWarnings("rawtypes") 
	public ArrayList<Expense> hasCharacteristic(String name, Comparable c) {
		ArrayList<Expense> aux = new ArrayList<Expense>();
		if (super.constainsCharacteristics(name) && super.compareToCharacteristics(name, c)) {
			aux.add(this); 
		} else {	
			for (Expense expense : expenses) {
				aux.addAll(expense.hasCharacteristic(name, c));
			}
		}
		return aux;
	}

	@Override
	public LocalDate getDate() {
		for (Expense expense : expenses) {
			if ((expense.getDate()) != null) {
				return expense.getDate();
			}
		}
		return null;
	}
	
	
	public boolean addExpenses(Expense expense) {
		return this.expenses.add(expense);
	 }
}

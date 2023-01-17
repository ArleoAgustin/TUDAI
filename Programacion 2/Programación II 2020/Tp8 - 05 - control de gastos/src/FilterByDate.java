import java.time.LocalDate;


public class FilterByDate extends Filter{
	private LocalDate date;
	
	public FilterByDate(LocalDate date) {
		super();
		this.date = date;
	}
	
	public FilterByDate(String dateString) {
		super();
		this.date = LocalDate.parse(dateString);
	}
	
	@Override
	public boolean filtrate(Expense expense) {
		return expense.getDate().isBefore(date);
	}
}

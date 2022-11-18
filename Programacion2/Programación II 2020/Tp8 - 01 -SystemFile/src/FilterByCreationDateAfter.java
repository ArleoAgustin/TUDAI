import java.time.LocalDate;

public class FilterByCreationDateAfter extends Filter{
	@Override
	public boolean filtrate(SystemFileElement sf) {
		return sf.getCreationDate().isAfter(LocalDate.now());
	}
}
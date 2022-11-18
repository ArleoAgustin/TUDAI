import java.time.LocalDate;

public class FilterByLastUpdateAfter extends Filter{
	@Override
	public boolean filtrate(SystemFileElement sf) {
		return sf.getLastUpdate().isAfter(LocalDate.now());
	}
}

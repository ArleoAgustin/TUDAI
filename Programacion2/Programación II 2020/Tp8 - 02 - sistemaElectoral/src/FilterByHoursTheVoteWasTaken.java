import java.time.LocalDateTime;

public class FilterByHoursTheVoteWasTaken extends Filter{
	private LocalDateTime dateBefore;
	private LocalDateTime dateAfter;
	
	public FilterByHoursTheVoteWasTaken(String string, String string2) {
		dateBefore = LocalDateTime.parse(string);
		dateAfter = LocalDateTime.parse(string2);
	}

	@Override
	public boolean filtrate(Vote vote) {
		return vote.getVoteDate().isBefore(dateAfter)&&vote.getVoteDate().isAfter(dateBefore);
	}
}


public class FilterByVoteOfAPolitician extends Filter{
	private Politician politician;
	
	public FilterByVoteOfAPolitician(Politician politician) {
		this.politician = politician;
	}

	@Override
	public boolean filtrate(Vote vote) {
		return vote.getPolitical()!=null&&vote.getPolitical().compareTo(politician) == 0;
	}

}

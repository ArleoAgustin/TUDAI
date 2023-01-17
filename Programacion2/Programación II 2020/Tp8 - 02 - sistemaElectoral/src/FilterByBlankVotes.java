
public class FilterByBlankVotes extends Filter{
	@Override
	public boolean filtrate(Vote vote) {
		return vote.getPolitical() ==  null;
	}

}

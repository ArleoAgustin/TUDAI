
public class FilterByName extends Filter{
	public String word;
	public FilterByName(String word) {
		this.word = word;
	}
	@Override
	public boolean filtrate(SystemFileElement sf) {
		return sf.getName().contains(word);
	}
}

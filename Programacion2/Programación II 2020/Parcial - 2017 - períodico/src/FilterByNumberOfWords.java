
public class FilterByNumberOfWords extends Filter{
	private int numberOfWords;
	 
	public FilterByNumberOfWords(int numberOfWords) {
		this.numberOfWords = numberOfWords;
	}

	@Override
	public boolean filtrate(News news) {
		return news.getText().split(" ").length > numberOfWords;
	}
}

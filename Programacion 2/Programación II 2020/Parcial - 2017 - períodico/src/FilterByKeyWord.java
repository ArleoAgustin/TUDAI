
public class FilterByKeyWord extends Filter{
	private String keyWord;
	 
	public FilterByKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	@Override
	public boolean filtrate(News news) {
		return news.containsWord(keyWord);
	}

}
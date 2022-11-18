
public class FilterByAuthor extends Filter{
	private String author;
	 
	public FilterByAuthor(String author) {
		this.author = author;
	}

	@Override
	public boolean filtrate(News news) {
		return author.equals(news.getAuthor());
	}

}

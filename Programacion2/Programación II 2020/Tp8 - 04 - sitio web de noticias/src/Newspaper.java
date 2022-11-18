import java.util.ArrayList;

public abstract class Newspaper {
	protected String titel;
	
	public Newspaper(String titel) {
		this.titel = titel;
	}
	
	public abstract ArrayList<News> getNews(Filter f);
	public abstract Newspaper pageCopy(Filter f);
	public abstract void getLink(String link);

	public String getTitel() {
		return titel;
	}
	public void setTitel(String titel) {
		this.titel = titel;
	}
}

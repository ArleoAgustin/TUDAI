import java.util.ArrayList;

public class News extends Newspaper{
	private ArrayList<String> keyWords;
	private String introduction;
	private String text;
	private String author;
	
	public News() {
		super("News");
		keyWords = new ArrayList<String>();
	}
	
	public News(String titel) {
		super(titel);
		this.introduction = "intro";
		this.text = "mucho texto";
		this.author = "Pedro";
		keyWords = new ArrayList<String>();
	}
	
	

	public News(String titel, String introduction,String text, String author) {
		super(titel);
		this.introduction = introduction;
		this.text = text;
		this.author = author;
		keyWords = new ArrayList<String>();
	}
	
	public News(News news) {
		super((new String(news.getTitel())));
		this.introduction = new String(news.getIntroduction());
		this.text = new String(news.getIntroduction());
		this.author =  new String(news.getAuthor());
		keyWords = news.getKeyWords();
	}


	@Override
	public ArrayList<News> getNews(Filter f) {
		ArrayList<News> aux = new ArrayList<News>();
		if (f.filtrate(this)) {
			aux.add(this);
			
		}
		return aux;
	}
	
	@Override
	public Newspaper pageCopy(Filter f) {
		if (f.filtrate(this)) {
			return new News(this);
		} else {
			return null;
		}
		
	}
	
	@Override
	public void getLink(String link) {
		System.out.println(link+"/"+this.titel);
	}
	
	public ArrayList<String> getKeyWords() {
		ArrayList<String> aux = new ArrayList<String>();
		for (String w1 : keyWords) {
			String w2 = w1;
			aux.add(new String(w2));
		}
		return aux;
	}
	
	public void addKeyWord(String word) {
		this.keyWords.add(word);
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean containsWord(String word) {
		return this.keyWords.contains(word);
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
}

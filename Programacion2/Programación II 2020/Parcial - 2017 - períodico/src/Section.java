import java.util.ArrayList;


public class Section extends Newspaper{
	private ArrayList<Newspaper> NewspaperParts;
	
	public Section() {
		super("Classifications");
		NewspaperParts = new ArrayList<Newspaper>();
	}
	
	public Section(String titel) {
		super(titel);
		NewspaperParts = new ArrayList<Newspaper>();
	}
	
	public Section(Section section) {
		super(new String(section.getTitel()));
		NewspaperParts = new ArrayList<Newspaper>();
	}
	
	public void addClassifications(Newspaper n) {
		this.NewspaperParts.add(n);
	}

	@Override
	public ArrayList<News> getNews(Filter f) {
		ArrayList<News> aux = new ArrayList<News>();
		for (Newspaper part : NewspaperParts) {
			aux.addAll(part.getNews(f));
		}
		return aux;
	}

	@Override
	public Newspaper pageCopy(Filter f) {
		Section aux = new Section(this);
		boolean flag = false;
		for (Newspaper part : NewspaperParts) {
			if(part.pageCopy(f) != null) {
				aux.addClassifications(part.pageCopy(f));
				flag = true;
			}
		}
		if(flag == false){
			aux = null;
		}
		return aux;
	}
	
	@Override
	public void getLink(String link) {
		System.out.println(link+"/"+this.titel);
		for (Newspaper section : NewspaperParts) {
			section.getLink(link+"/"+this.titel);
		}
	}
}

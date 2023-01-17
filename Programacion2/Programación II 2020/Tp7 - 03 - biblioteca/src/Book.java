
public class Book {
	private static int number;
	private int isbm;
	private String author;
	private int yearEdition; 
	private String mainGenre;
	
	public Book(String author, int yearEdition, String mainGenre) {
		this.isbm = number;
		this.author = author;
		this.yearEdition = yearEdition;
		this.mainGenre = mainGenre;
		number++;
	}
	
	public int getIsbm() {
		return isbm;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYearEdition() {
		return yearEdition;
	}
	public void setYearEdition(int yearEdition) {
		this.yearEdition = yearEdition;
	}
	public String getMainGenre() {
		return mainGenre;
	}
	public void setMainGenre(String mainGenre) {
		this.mainGenre = mainGenre;
	}
	
	public String toString() {
		return "Book: "+isbm+", "+author+", "+yearEdition+", "+mainGenre+"\n";
	}
}

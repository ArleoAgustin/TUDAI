import java.util.Comparator;


public class ComparatorByISBM implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getIsbm() - b2.getIsbm();
	}
}

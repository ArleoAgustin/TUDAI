import java.util.Comparator;


public class ComparatorByYearOfEdition implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getYearEdition() - b2.getYearEdition();
	}
}
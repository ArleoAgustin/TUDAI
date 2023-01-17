import java.util.Comparator;


public class ComparatorByGenre implements Comparator<Book>{
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getMainGenre().compareTo(b2.getMainGenre());
	}
}

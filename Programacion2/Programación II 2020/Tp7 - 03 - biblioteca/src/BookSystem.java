import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class BookSystem {
	private ArrayList<Book> books;
	
	public  BookSystem() {
		books = new ArrayList<Book>();
	}
	
	public void orderAsendingBooks(Comparator<Book> comparator) {
		Collections.sort(books, comparator);
	}
	
	public void orderDesendingBooks(Comparator<Book> comparator) {
		Collections.sort(books, comparator.reversed());
	}
	
	/*
	 public void orderDesendingBooks(Comparator<Book> comparator) {
		this.orderAsendingBooks(comparator);
		Collections.reverse(books);
	 } */

	public void addBook(Book b) {
		books.add(b);
	}
	
	public void printBooks() {
		System.out.println("\n\nBooks: \n"+books);
	}
}

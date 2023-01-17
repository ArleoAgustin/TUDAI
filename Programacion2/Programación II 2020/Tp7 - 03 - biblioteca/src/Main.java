import java.util.Comparator;


public class Main {
	public static void main(String[] args) {
		BookSystem bS = new BookSystem();
		Book b0 =  new Book("j. author", 2001, "Amor");
		Book b1 =  new Book("i. author", 2005, "Romanace");
		Book b2 =  new Book("h. author", 2007, "Pileta");
		Book b3 =  new Book("g. author", 2003, "Documental");
		Book b4 =  new Book("f. author", 2008, "Odio");
		Book b5 =  new Book("e. author", 2002, "Horno");
		Book b6 =  new Book("d. author", 2007, "Vapor");
		Book b7 =  new Book("c. author", 2006, "Escalera");
		Book b8 =  new Book("b. author", 2007, "Xilofon");
		Book b9 =  new Book("a. author", 2000, "Zapato");
		
		bS.addBook(b0);
		bS.addBook(b1);
		bS.addBook(b2);
		bS.addBook(b3);
		bS.addBook(b4);
		bS.addBook(b5);
		bS.addBook(b6);
		bS.addBook(b7);
		bS.addBook(b8);
		bS.addBook(b9);
		
		Comparator<Book> c0 = new ComparatorByISBM();
		Comparator<Book> c1 = new ComparatorByAuthor();
		Comparator<Book> c2 = new ComparatorByYearOfEdition();
		Comparator<Book> c3 = new ComparatorByGenre();
		
		bS.orderAsendingBooks(c0);
		bS.printBooks();
		bS.orderAsendingBooks(c1);
		bS.printBooks();
		bS.orderDesendingBooks(c2);
		bS.printBooks();
		bS.orderDesendingBooks(c3);
		bS.printBooks();
	}
}

package patterns;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class IteratorPattern {

	public static void main(String[] args) {
		Library library = new Library();
		library.add(new Book());
		library.add(new Book());
		Iterator<Book> books =  library.getBooksOld();
		Stream<Book> booksStream = library.getBooks();
	}

}

class Library {
	private Set<Book> books = new HashSet<>();
	
	public Stream<Book> getBooks() {
		return books.stream();
	}
	
	public Iterator<Book> getBooksOld() {
		return books.iterator();
	}
	
	public void add(Book book) {
		books.add(book);
	}
	
}

class Book {
	
}

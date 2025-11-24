package pr.pr7;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }
    public BookIterator iterator() {
        return new BookIterator(books);
    }
}

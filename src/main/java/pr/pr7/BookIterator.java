package pr.pr7;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

@Data
public class BookIterator implements Iterator<Book> {
    private final List<Book> books = new ArrayList<>();
    private int index = 0;

    public BookIterator(List<Book> books) {
        this.books.addAll(books);
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Book next() {
        if (!hasNext()){
            throw new NoSuchElementException("No more books available.");
        }
        return books.get(index++);
    }
}

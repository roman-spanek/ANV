package pr.pr7;

public class Demo {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();

        Book book1 = new Book();
        book1.setName("The Great Gatsby");
        bookCollection.addBook(book1);

        Book book2 = new Book();
        book2.setName("1984");
        bookCollection.addBook(book2);

        Book book3 = new Book();
        book3.setName("To Kill a Mockingbird");
        bookCollection.addBook(book3);

        Iterator<Book> iterator = bookCollection.iterator();
        System.out.println(iterator);

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Name: " + book.getName());
        }

    }
}

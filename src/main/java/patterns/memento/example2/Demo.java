package patterns.memento.example2;

public class Demo {
    public static void main(String[] args) {
        Document document = new Document("Initial content\n");
        History history = new History();
        history.save(document.createMemento());

        // Write some content
        document.write("Additional content\n");
        history.save(document.createMemento());

        // Write more content
        document.write("More content\n");
        history.save(document.createMemento());
        System.out.println(document.getContent());
        // Restore to previous state
        document.restoreFromMemento(history.undo(1));

        // Print document content
        System.out.println(document.getContent());
    }
}

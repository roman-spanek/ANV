package patterns.memento.example2;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<DocumentMemento> mementos;

    public History() {
        this.mementos = new ArrayList<>();
    }

    public void save(DocumentMemento memento) {
        this.mementos.add(memento);
    }

    public DocumentMemento undo(int index) {
        return this.mementos.get(index);
    }
}

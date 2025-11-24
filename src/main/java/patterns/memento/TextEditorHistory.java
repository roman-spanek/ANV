package patterns.memento;

import java.util.Stack;

public class TextEditorHistory {
    private Stack<TextEditorMemento> history;
    public TextEditorHistory() {
        this.history = new Stack<>();
    }
    public void saveState(TextEditorMemento memento) {
        history.push(memento);
    }
    public TextEditorMemento restoreState() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
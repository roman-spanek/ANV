package clean.code.example.refactor;

import java.util.Stack;

public class CartHistory {
    private final Stack<CartMemento> undoStack = new Stack<>();
    private final Stack<CartMemento> redoStack = new Stack<>();

    public void save(Cart cart) { undoStack.push(cart.createMemento()); }
    public void undo(Cart cart) {
        if (!undoStack.isEmpty()) {
            redoStack.push(cart.createMemento());
            CartMemento m = undoStack.pop();
            cart.restoreMemento(m);
        }
    }
    public void redo(Cart cart) {
        if (!redoStack.isEmpty()) {
            undoStack.push(cart.createMemento());
            CartMemento m = redoStack.pop();
            cart.restoreMemento(m);
        }
    }
}

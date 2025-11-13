package patterns.visitor.refactored;

public interface DocumentElement {
    void accept(DocumentVisitor visitor);
}

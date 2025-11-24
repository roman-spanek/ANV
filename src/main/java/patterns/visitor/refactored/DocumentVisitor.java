package patterns.visitor.refactored;

public interface DocumentVisitor {
    void visit(Text text);
    void visit(Image image);
    void visit(Table table);
}
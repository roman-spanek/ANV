package patterns.visitor.refactored;

public class PlainTextExporter implements DocumentVisitor {
    @Override
    public void visit(Text text) {
        System.out.println("Text: " + text.getContent());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Image: [image at " + image.getImagePath() + "]");
    }

    @Override
    public void visit(Table table) {
        System.out.println("Table: " + table.getRows() + "x" + table.getColumns());
    }
}

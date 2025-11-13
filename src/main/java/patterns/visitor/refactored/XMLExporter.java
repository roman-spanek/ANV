package patterns.visitor.refactored;

public class XMLExporter implements DocumentVisitor {
    @Override
    public void visit(Text text) {
        System.out.println("<text>" + text.getContent() + "</text>");
    }

    @Override
    public void visit(Image image) {
        System.out.println("<image src=\"" + image.getImagePath() + "\"/>");
    }

    @Override
    public void visit(Table table) {
        System.out.println("<table rows=\"" + table.getRows() + "\" columns=\"" + table.getColumns() + "\"/>");
    }
}

package patterns.visitor.before;

import lombok.Data;

@Data
public class Table {
    private final int rows, columns;

    public void exportAsPlainText() {
        System.out.println("Table: " + rows + "x" + columns);
    }

    public void exportAsXML() {
        System.out.println("<table rows=\"" + rows + "\" columns=\"" + columns + "\"/>");
    }
}

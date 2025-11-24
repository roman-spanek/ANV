package patterns.visitor.refactored;

import lombok.Getter;

@Getter
public class Table implements DocumentElement {
    private final int rows;
    private final int columns;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
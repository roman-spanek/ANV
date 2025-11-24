package patterns.visitor.refactored;

import lombok.Getter;

@Getter
public class Text implements DocumentElement {
    private final String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}


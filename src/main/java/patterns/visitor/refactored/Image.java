package patterns.visitor.refactored;

import lombok.Getter;

@Getter
public class Image implements DocumentElement {
    private final String imagePath;

    public Image(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
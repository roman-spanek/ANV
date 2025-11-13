package patterns.visitor.before;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Image {
    private String imagePath;

    public void exportAsPlainText() {
        System.out.println("Image: [image at " + imagePath + "]");
    }

    public void exportAsXML() {
        System.out.println("<image src=\"" + imagePath + "\"/>");
    }
}

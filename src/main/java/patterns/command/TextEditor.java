package patterns.command;

public class TextEditor {
    private String clipboard = "";
    private String text = "";

    public void copy(String content) {
        clipboard = content;
        System.out.println("Copied: " + clipboard);
    }

    public void paste() {
        text += clipboard;
        System.out.println("Text after paste: " + text);
    }
}


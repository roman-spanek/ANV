package patterns.command;

public class CopyCommand implements Command {
    private TextEditor editor;
    private String content;

    public CopyCommand(TextEditor editor, String content) {
        this.editor = editor;
        this.content = content;
    }

    @Override
    public void execute() {
        editor.copy(content);
    }
}

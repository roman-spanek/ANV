package patterns.command;

public class PasteCommand implements Command {
    private TextEditor editor;

    public PasteCommand(TextEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.paste();
    }
}

package patterns.command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        // Vytvoření příkazů
        Command copyHello = new CopyCommand(editor, "Hello ");
        Command copyWorld = new CopyCommand(editor, "World!");
        Command paste = new PasteCommand(editor);

        // Přiřazení příkazů k tlačítkům
        Button copyButton1 = new Button(copyHello);
        Button copyButton2 = new Button(copyWorld);
        Button pasteButton = new Button(paste);

        // Simulace kliknutí uživatele
        copyButton1.click(); // Kopíruje "Hello "
        pasteButton.click(); // Vloží "Hello "
        copyButton2.click(); // Kopíruje "World!"
        pasteButton.click(); // Vloží "World!" => Text: "Hello World!"
    }
}
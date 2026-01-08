package refactoring.refactored.command;

import refactoring.refactored.factory.SaveHandler;

public class SaveCommand implements Command {
    private final SaveHandler handler;
    private final String text;

    public SaveCommand(SaveHandler handler, String text) {
        this.handler = handler;
        this.text = text;
    }
    public void execute() { handler.save(text); }
}
package refactoring.refactored;

import refactoring.refactored.command.Command;
import refactoring.refactored.command.SaveCommand;
import refactoring.refactored.decorator.TrimDecorator;
import refactoring.refactored.factory.SaveFactory;
import refactoring.refactored.factory.SaveHandler;
import refactoring.refactored.observer.ConsoleUI;
import refactoring.refactored.strategy.CapitalFormat;
import refactoring.refactored.strategy.UpperCaseFormat;

public class AfterRefactor {
    public static void main(String[] args) {

        CleanTextEditor editor = new CleanTextEditor();
        editor.addObserver(new ConsoleUI());

        // Set initial strategy
        editor.setFormatter(new UpperCaseFormat());

        String text = "hello world";
        String formatted = editor.format(text);
        System.out.println("Formatted: " + formatted);

        // Add decorator (Trim + Capital)
        editor.setFormatter(
                new TrimDecorator(
                        new CapitalFormat()
                )
        );

        formatted = editor.format("   another example   ");
        System.out.println("Formatted: " + formatted);

        // Save using factory + command
        SaveHandler handler = SaveFactory.create("xml");
        Command saveCmd = new SaveCommand(handler, formatted);
        saveCmd.execute();
    }
}
/*
BENEFITS of Applying the Patterns
🟩 Strategy

Removes if/else formatting

Add new formats without editing editor code

🟩 Decorator

Dynamically add features to formatting

Cleaner than inheritance

🟩 Observer

UI receives notifications without coupling

🟩 Factory Method

Centralized object creation

Adding new saving formats is trivial

🟩 Command

Editor actions are reusable, undoable, and testable

🟩 Clean Code Principles Achieved

SRP (editor has single responsibility)

OCP (new behavior added without modifying existing code)

DIP (UI depends on abstractions, not editor internals)

LSP / ISP supported via interfaces
        */
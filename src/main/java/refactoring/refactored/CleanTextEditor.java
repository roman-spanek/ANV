package refactoring.refactored;

import refactoring.refactored.observer.EditorObserver;
import refactoring.refactored.strategy.FormatStrategy;

import java.util.ArrayList;
import java.util.List;

public class CleanTextEditor {
    private final List<EditorObserver> observers = new ArrayList<>();
    private FormatStrategy formatter;

    public void setFormatter(FormatStrategy formatter) {
        this.formatter = formatter;
        notifyAll("Changed formatter to: " + formatter.getClass().getSimpleName());
    }

    public String format(String text) {
        return formatter.format(text);
    }

    public void notifyAll(String msg) {
        for (EditorObserver obs : observers) obs.onEvent(msg);
    }

    public void addObserver(EditorObserver obs) {
        observers.add(obs);
    }
}

package refactoring.refactored.observer;

public class ConsoleUI implements EditorObserver {
    @Override public void onEvent(String msg) {
        System.out.println("[UI] " + msg);
    }
}
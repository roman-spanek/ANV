package refactoring.pr;

public class UIEditorSubscriber implements  EditorSubscriber {
    @Override
    public void notifyUI(String message) {
        System.out.println("[UI] " + message);
    }
}

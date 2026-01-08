package refactoring.refactored.factory;

public class TxtSaveHandler implements SaveHandler {
    public void save(String text) {
        System.out.println("Saving TXT: " + text);
    }
}

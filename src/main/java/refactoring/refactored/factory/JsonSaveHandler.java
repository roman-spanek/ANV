package refactoring.refactored.factory;

public class JsonSaveHandler implements SaveHandler {
    public void save(String text) {
        System.out.println("Saving JSON: {\"text\":\"" + text + "\"}");
    }
}
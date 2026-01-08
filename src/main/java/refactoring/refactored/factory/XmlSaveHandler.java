package refactoring.refactored.factory;

public class XmlSaveHandler implements SaveHandler {
    public void save(String text) {
        System.out.println("Saving XML: <text>" + text + "</text>");
    }
}

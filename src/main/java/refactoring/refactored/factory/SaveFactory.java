package refactoring.refactored.factory;

public class SaveFactory {
    public static SaveHandler create(String type) {
        return switch (type) {
            case "txt" -> new TxtSaveHandler();
            case "json" -> new JsonSaveHandler();
            case "xml" -> new XmlSaveHandler();
            default -> throw new IllegalArgumentException("Unknown save format");
        };
    }
}
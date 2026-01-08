package refactoring.before;

// BAD CODE - No patterns, no clean architecture
public class BadTextEditor {
    void save(String type, String text) {
        if (type.equals("txt")) {
            System.out.println("Saving TXT: " + text);
        } else if (type.equals("json")) {
            System.out.println("Saving JSON: {\"text\":\"" + text + "\"}");
        } else if (type.equals("xml")) {
            System.out.println("Saving XML: <text>" + text + "</text>");
        }
    }
    void format(String mode, String text) {
        if (mode.equals("upper")) {
            System.out.println(text.toUpperCase());
        } else if (mode.equals("lower")) {
            System.out.println(text.toLowerCase());
        } else if (mode.equals("capital")) {
            System.out.println(
                    text.substring(0,1).toUpperCase() + text.substring(1)
            );
        }
    }
    void notifyUI(String message) {
        System.out.println("[UI] " + message);
    }
}


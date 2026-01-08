package refactoring.refactored.strategy;

public class LowerCaseFormat implements FormatStrategy {
    public String format(String text) { return text.toLowerCase(); }
}

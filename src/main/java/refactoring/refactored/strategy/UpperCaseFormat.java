package refactoring.refactored.strategy;

public class UpperCaseFormat implements FormatStrategy {
    public String format(String text) { return text.toUpperCase(); }
}
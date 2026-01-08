package refactoring.refactored.strategy;

public class CapitalFormat implements FormatStrategy {
    public String format(String text) {
        return text.substring(0,1).toUpperCase() + text.substring(1);
    }
}
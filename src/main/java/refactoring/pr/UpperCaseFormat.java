package refactoring.pr;

public class UpperCaseFormat implements  FormatStrategy {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

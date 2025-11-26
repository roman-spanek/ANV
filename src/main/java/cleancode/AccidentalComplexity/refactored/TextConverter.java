package cleancode.AccidentalComplexity.refactored;

public class TextConverter {

    public String convertToUpperCase(String input) {
        if (input == null) {
            return null;
        }
        return input.toUpperCase();
    }
}

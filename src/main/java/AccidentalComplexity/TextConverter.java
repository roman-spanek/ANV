package AccidentalComplexity;

public class TextConverter {

    public String convertToUpperCase(String input) {
        if (input == null) {
            return null;
        }

        // unnecessary complexity: using multiple loops and conditions
        char[] chars = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - ('a' - 'A')));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append(c);
            } else {
                sb.append(c); // non-alphabetic characters
            }
        }

        return sb.toString();
    }
}
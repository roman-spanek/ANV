package PrematureOptimization;

public class StringConcatenator {

    public String concatenate(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            // Předčasná optimalizace: snažíme se ušetřit paměť tím, že nepoužíváme StringBuilder
            result += words[i]; // Vytváří se nový objekt při každé iteraci
        }
        return result;
    }

    public String concatenateRefactor(String[] words) {
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word);
        }
        return result.toString();
    }

}


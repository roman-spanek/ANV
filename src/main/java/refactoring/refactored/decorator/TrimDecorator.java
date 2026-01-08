package refactoring.refactored.decorator;

import refactoring.refactored.strategy.FormatStrategy;

public class TrimDecorator extends FormatDecorator {
    public TrimDecorator(FormatStrategy inner) { super(inner); }
    public String format(String text) { return inner.format(text.trim()); }
}

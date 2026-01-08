package refactoring.refactored.decorator;

import refactoring.refactored.strategy.FormatStrategy;

public class FormatDecorator  implements FormatStrategy {
    protected FormatStrategy inner;

    public FormatDecorator(FormatStrategy inner) {
        this.inner = inner;
    }
    public String format(String text) { return inner.format(text); }
}

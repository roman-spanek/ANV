package patterns.decorator.refactored;

import java.util.ArrayList;
import java.util.List;

public class DynamicNotifier  implements Notifier {
    private final Notifier base;
    private final List<NotifierDecorator> decorators = new ArrayList<>();

    public DynamicNotifier(Notifier base) {
        this.base = base;
    }

    public void addDecorator(NotifierDecorator decorator) {
        decorators.add(decorator);
    }

    @Override
    public void send(String message) {
        Notifier current = base;
        // Procházíme všechny dekorátory a "obalujeme" je dynamicky
        for (NotifierDecorator decorator : decorators) {
            decorator.wrapper = current; // Přepojení wrappee
            current = decorator;
        }
        current.send(message); // Posíláme zprávu přes všechny vrstvy
    }
}

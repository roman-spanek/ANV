package patterns.decorator.before;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new Notifier("user@example.com");
        notifier.send("Important update!");

        // Klient musí volat všechny kanály ručně
        notifier.sendSMS("123456789", "Important update!");
        notifier.sendSlack("@user", "Important update!");
    }
}

/*
Problémy tohoto kódu:

Třída Notifier porušuje Single Responsibility Principle – stará se o email, SMS i Slack.

Porušuje Open/Closed Principle – pokud chci nový kanál (např. Facebook), musím měnit původní třídu.

Klient musí explicitně volat všechny metody – těžko se spravuje kombinace kanálů.
 */
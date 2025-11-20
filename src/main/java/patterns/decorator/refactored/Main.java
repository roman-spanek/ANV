package patterns.decorator.refactored;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier("user@example.com");

        // Přidání SMS a Slack dekorátorů
        notifier = new SMSDecorator(notifier, "123456789");
        notifier = new SlackDecorator(notifier, "@user");

        Notifier notifier2 = new SlackDecorator(
                new SMSDecorator(
                        new EmailNotifier("email"), "123456789"), "@user");

        // Jediný volání - všechny kanály se pošlou automaticky
        notifier.send("Important update!");

        DynamicNotifier dynamicNotifier = new DynamicNotifier(notifier);

        // Dynamicky přidáváme kanály
        dynamicNotifier.addDecorator(new SMSDecorator(null, "123456789"));
        dynamicNotifier.addDecorator(new SlackDecorator(null, "@user"));

        // Jediný volání pošle zprávu všemi kanály
        dynamicNotifier.send("Critical system alert!");
    }
}

/*
Výhody použití Decoratoru:

Single Responsibility Principle – každá třída má jen jednu zodpovědnost.

Open/Closed Principle – nové kanály přidáte vytvořením nového dekorátoru, třídy stávající se nemění.

Klient nemusí upravovat kód – pouze skládá dekorátory podle potřeby.

Kód je čitelnější a udržovatelný – logika pro každý kanál je oddělena.


Co tato verze řeší:

Dynamické přidávání kanálů – klient si může libovolně skládat dekorátory během runtime.

Open/Closed Principle – nové kanály (např. WhatsApp) lze přidat vytvořením nového dekorátoru, bez změn existujících tříd.

Single Responsibility Principle – každá třída řeší jen jeden kanál.

Kód je čistý a udržovatelný – klient nemusí upravovat kód notifikátorů, pouze je skládá.
 */
package patterns.proxy.before;

public class MainWithoutProxy {
    public static void main(String[] args) {
        System.out.println("Klient 1 začíná...");
        HeavyService service1 = new HeavyService();
        service1.performTask();

        System.out.println("Klient 2 začíná...");
        HeavyService service2 = new HeavyService(); // znovu drahá inicializace
        service2.performTask();
    }
}

/*
Problémy řešení bez proxy:

Každý klient znovu inicializuje těžký objekt → vysoká zátěž a zbytečné opakování kódu.

Žádná kontrola přístupu nebo lazy initialization.

Klient je přímo závislý na těžkém objektu.
 */
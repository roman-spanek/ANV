package patterns.proxy.refactor;

public class ServiceProxy implements IService {
    private HeavyService realService;

    @Override
    public void performTask() {
        if (realService == null) {
            System.out.println("Proxy: Tvořím HeavyService2 až nyní...");
            realService = new HeavyService(); // lazy initialization
        }
        realService.performTask();
    }
}

/*
Výhody použití Proxy:

Lazy Initialization – těžký objekt se vytvoří až když je potřeba.

Kontrola přístupu – proxy může zkontrolovat oprávnění klienta.

Nižší závislost klienta na implementaci – klient používá jen rozhraní IService.

Možnost logování, cachování nebo bezpečnostních úprav bez změny původní třídy.
 */
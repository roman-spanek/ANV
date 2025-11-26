package patterns.proxy.refactor.lazy_loading;

public class SharedServiceProxy implements IService {
    private static HeavyService realService;

    @Override
    public void performTask() {
        if (realService == null) {
            System.out.println("Proxy: Tvořím HeavyService jen jednou...");
            realService = new HeavyService(); // lazy initialization
        } else {
            System.out.println("Proxy: Používám již existující HeavyService");
        }
        realService.performTask();
    }
}

/*
Výhody této verze Proxy

Lazy Initialization – těžký objekt se vytvoří až při prvním požadavku.

Sdílená instance – všechny klienty používají stejnou instanci, žádná duplicita.

Open/Closed Principle – proxy je snadno rozšiřitelná, aniž by se měnila původní třída.

Kontrola přístupu / logování / cachování – všechny tyto funkce lze přidat do proxy bez úprav původního HeavyService.
 */
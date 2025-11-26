package patterns.proxy.before;

public class HeavyService {
    public HeavyService() {
        // Simulace náročné inicializace
        System.out.println("HeavyService: Inicializuji zdroje...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
    }

    public void performTask() {
        System.out.println("HeavyService: Provádím úkol!");
    }
}
package patterns.proxy.refactor;

public class MainWithProxy {
    public static void main(String[] args) {
        System.out.println("Klient 1 začíná...");
        IService service1 = new ServiceProxy();
        service1.performTask();

        System.out.println("Klient 2 začíná...");
        IService service2 = new ServiceProxy();
        service2.performTask(); // proxy může rozhodnout sdílet instanci nebo vytvořit novou
    }
}

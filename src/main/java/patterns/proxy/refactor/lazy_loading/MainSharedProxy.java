package patterns.proxy.refactor.lazy_loading;

public class MainSharedProxy {
    public static void main(String[] args) {
        System.out.println("Klient 1 začíná...");
        IService service1 = new SharedServiceProxy();
        service1.performTask();

        System.out.println("Klient 2 začíná...");
        IService service2 = new SharedServiceProxy();
        service2.performTask();

        System.out.println("Klient 3 začíná...");
        IService service3 = new SharedServiceProxy();
        service3.performTask();
    }
}

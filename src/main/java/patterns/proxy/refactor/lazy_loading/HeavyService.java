package patterns.proxy.refactor.lazy_loading;

import patterns.proxy.refactor.IService;

public class HeavyService implements IService {
    public HeavyService() {
        System.out.println("HeavyService2: Inicializuji zdroje...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void performTask() {
        System.out.println("HeavyService2: Provádím úkol!");
    }
}

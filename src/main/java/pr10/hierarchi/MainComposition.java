package pr10.hierarchi;

public class MainComposition {
    public static void main(String[] args) {
        Car electricCar = new Car(new ElectricEngine());
        Car gasCar = new Car(new GasolineEngine());
        electricCar.start();
        gasCar.start();

        Car hybridCar = new Car(new HybridEngine(new ElectricEngine(), new GasolineEngine()));
        hybridCar.start();

    }
}

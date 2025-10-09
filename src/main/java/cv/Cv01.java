package cv;

public class Cv01 {

    public static void main(String[] args) {
        Logistics road = new CarFactory();
        Logistics sea = new ShipFactory();

        road.planDelivery();
        sea.planDelivery();


    }
}

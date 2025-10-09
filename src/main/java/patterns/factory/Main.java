package patterns.factory;

public class Main {
    public static void main(String[] args) {
        Logistics road = new RoadLogistics();
        Logistics sea = new SeaLogistics();

        road.planDelivery(); // Výstup: Delivering cargo by land in a truck.
        sea.planDelivery();  // Výstup: Delivering cargo by sea in a ship.
    }
}

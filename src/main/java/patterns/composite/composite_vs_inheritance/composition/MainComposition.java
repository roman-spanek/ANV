package patterns.composite.composite_vs_inheritance.composition;

public class MainComposition {
    public static void main(String[] args) {
        Engine gas = new GasolineEngine();
        Engine electric = new ElectricEngine();

        Vehicle car = new Vehicle(gas);
        car.start(); // Gasoline engine starting

        // Dynamická změna chování
        car.setEngine(electric);
        car.start(); // Electric engine starting silently
    }
}

/*
Výhody kompozice:

Vozidlo není pevně svázáno s konkrétním typem motoru.

Lze měnit motor dynamicky během běhu programu (setEngine).

Přidání nového typu motoru nevyžaduje měnit třídu Vehicle.

Snižuje složitost hierarchie tříd a zvyšuje flexibilitu.
 */

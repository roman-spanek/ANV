package patterns.composite.composite_vs_inheritance.inheritance;

public class MainInheritance {
    public static void main(String[] args) {
        Vehicle car1 = new Car();
        Vehicle car2 = new ElectricCar();

        car1.start(); // Car with gasoline engine starting
        car2.start(); // Electric car starting silently
    }
}

/*
Problém:

Pokud budeme mít nové typy motorů nebo nové typy vozidel, musíme tvořit nové třídy a překrývat metody.

Silně svázaná hierarchie a nízká flexibilita.
 */

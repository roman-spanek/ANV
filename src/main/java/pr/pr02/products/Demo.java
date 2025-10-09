package pr.pr02.products;

import pr.pr02.products.builder.CarBuilder;
import pr.pr02.products.builder.Director;
import pr.pr02.products.builder.ManualBuilder;

public class Demo {

    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();

        director.constructSportsCar(carBuilder);
        Car car = carBuilder.build();

        director.constructSportsCar(manualBuilder);
        ManualCar manual = manualBuilder.buildManualCar();



    }
}

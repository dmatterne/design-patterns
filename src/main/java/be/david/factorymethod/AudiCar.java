package be.david.factorymethod;

import java.awt.*;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class AudiCar extends Car {

    public AudiCar(Color color, String fuelType) {
        super(color, fuelType);
    }

    public AudiCar(String make, String model, Color color, int cc, String seats, boolean spoiler, boolean berline, String fuelType, int fuelLevel) {
        super(make, model, color, cc, seats, spoiler, berline, fuelType, fuelLevel);
    }

}

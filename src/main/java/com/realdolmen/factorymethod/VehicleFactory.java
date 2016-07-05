package com.realdolmen.factorymethod;

import java.awt.*;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public interface VehicleFactory {

    Car createCar(Color color, String fuel);
    Truck createTruck(String load);



//    Car createCar(String color, String fuelType) {
//
//        return new Car(
//                "audi",
//                "A3",
//                "black",
//                1600,
//                "leather Black",
//                false,
//                false,
//                "diesel",
//                1
//        );
//    }
}

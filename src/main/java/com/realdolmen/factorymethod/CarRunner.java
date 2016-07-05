package com.realdolmen.factorymethod;

import java.awt.*;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class CarRunner {
    public static void main(String[] args) {
//        Car a3 = new Car("Audi","A3", "Black" , 1600, "Leather Black", false, false, "Diesel", 1);
//
//        CarFactory f = new CarFactory();
//        Car c = f.createCar("Black","Diesel");


        VehicleFactory f = new ToyotaVehicleFactory();
        Car c = f.createCar(Color.red,"Diesel");

        Truck t = f.createTruck(1000);
    }
}

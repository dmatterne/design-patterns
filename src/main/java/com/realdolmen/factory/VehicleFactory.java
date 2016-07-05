package com.realdolmen.factory;

public interface VehicleFactory {
    Car createCar(Color color, String model);
    Truck createTruck(int capacity);
}


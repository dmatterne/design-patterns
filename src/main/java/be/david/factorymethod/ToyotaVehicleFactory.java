package be.david.factorymethod;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class ToyotaVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar(String color, String brand) {
        return null;
    }

    @Override
    public Truck createTruck(String load) {
        return null;
    }
}

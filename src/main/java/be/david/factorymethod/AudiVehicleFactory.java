package be.david.factorymethod;


/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class AudiVehicleFactory  implements VehicleFactory {

    @Override
    public Car createCar(Color color, String model) {
        return new AudiCar(color,model);
    }

    @Override
    public Truck createTruck(int capacity) {
        return new AudiTruck(capacity);
    }
}

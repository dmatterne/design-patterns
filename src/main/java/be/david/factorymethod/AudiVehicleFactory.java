package be.david.factorymethod;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class AudiVehicleFactory  implements VehicleFactory {

    @Override
    public Car createCar(String color, String fuel) {
        return new AudiCar("Audi","A3",color,1600,"Leather Black",false,false,fuel,1);
    }

    @Override
    public Truck createTruck(String load) {
        return null;
    }
}

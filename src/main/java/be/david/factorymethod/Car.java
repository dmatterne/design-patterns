package be.david.factorymethod;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public abstract class Car {
    private String make;
    private String model;
    private Color color;
//    private int cc;
//    private String seats;
//    private boolean spoiler;
//    private boolean berline;
//    private String fuelType;
//    private int fuelLevel;

    public Car(Color color, String model, String make) {
        this.color = color;
        this.model = model;
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

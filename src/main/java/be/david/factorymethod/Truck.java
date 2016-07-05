package be.david.factorymethod;

import java.awt.*;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class Truck {

    private String make;
    private String model;
    private Color color;
    private int cc;
    private String fuelType;
    private int fuelLevel;
    private int capacity;

    public Truck(String make, String model, Color color, int cc, String fuelType, int fuelLevel, int capacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.cc = cc;
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
        this.capacity = capacity;
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

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

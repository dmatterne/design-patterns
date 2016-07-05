package com.realdolmen.factorymethod;

import java.awt.*;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private int cc;
    private String seats;
    private boolean spoiler;
    private boolean berline;
    private String fuelType;
    private int fuelLevel;

    public Car(Color color, String fuelType) {
        this.color = color;
        this.fuelType = fuelType;
    }

    public Car(String make, String model, Color color, int cc, String seats, boolean spoiler, boolean berline, String fuelType, int fuelLevel) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.cc = cc;
        this.seats = seats;
        this.spoiler = spoiler;
        this.berline = berline;
        this.fuelType = fuelType;
        this.fuelLevel = fuelLevel;
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

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public boolean isSpoiler() {
        return spoiler;
    }

    public void setSpoiler(boolean spoiler) {
        this.spoiler = spoiler;
    }

    public boolean isBerline() {
        return berline;
    }

    public void setBerline(boolean berline) {
        this.berline = berline;
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
}

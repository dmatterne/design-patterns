package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public abstract class Beverage {

    private String description;

    public Beverage() {
    }

    public Beverage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();


}

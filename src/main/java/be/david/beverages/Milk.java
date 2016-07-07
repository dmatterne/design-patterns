package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }

}

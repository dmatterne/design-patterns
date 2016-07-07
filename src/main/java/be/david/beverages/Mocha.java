package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with mocha";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 1.5;
    }
}

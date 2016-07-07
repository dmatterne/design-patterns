package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    @Override
    public abstract String getDescription();
}

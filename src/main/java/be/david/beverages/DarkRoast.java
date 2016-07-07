package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        super("DarkRoast");
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

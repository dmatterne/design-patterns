package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        super("House blend");
    }

    @Override
    public double cost() {
        return 3.85;
    }
}

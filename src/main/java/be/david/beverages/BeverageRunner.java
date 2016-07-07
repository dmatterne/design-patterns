package be.david.beverages;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class BeverageRunner {

    public static void main(String[] args) {

        Beverage a = new Milk(new DarkRoast());
        Beverage b = new Milk(new HouseBlend());
        Beverage c = new Mocha(new DarkRoast());
        Beverage d = new Mocha(new HouseBlend());
        Beverage e = new Milk(new Mocha(new DarkRoast()));
        Beverage f = new Milk(new Mocha(new HouseBlend()));

        System.out.println(a.getDescription() + " and cost " + a.cost());
        System.out.println(b.getDescription() + " and cost " + b.cost());
        System.out.println(c.getDescription() + " and cost " + c.cost());
        System.out.println(d.getDescription() + " and cost " + d.cost());
        System.out.println(e.getDescription() + " and cost " + e.cost());
        System.out.println(f.getDescription() + " and cost " + f.cost());



    }
}

package be.david.singleton;

/**
 * Created by stannisbaratheon on 05/07/16.
 */
public class ChocolateFactory {

    public static void main(String[] args) {


        ChocolateBoiler a = ChocolateBoiler.getInstance();
        ChocolateBoiler b = ChocolateBoiler.getInstance();

        if (a == b) {
            System.out.println("Correct");
        }

//        ChocolateTest c = new ChocolateTest(true);
//        ChocolateTest d = new ChocolateTest(true);
//
//        if (c == d) {
//            System.out.println("Correct2");
//        }

    }


}

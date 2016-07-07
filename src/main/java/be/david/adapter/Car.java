package be.david.adapter;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class Car {

    private SpeedoMeter speedoMeter;

    public Car() {
    }

    public Car(SpeedoMeter speedoMeter) {
        this.speedoMeter = speedoMeter;
    }

    public int getSpeed() {
        return speedoMeter.getSpeed();
    }

    public SpeedoMeter getSpeedoMeter() {
        return speedoMeter;
    }

    public void setSpeedoMeter(SpeedoMeter speedoMeter) {
        this.speedoMeter = speedoMeter;
    }
}

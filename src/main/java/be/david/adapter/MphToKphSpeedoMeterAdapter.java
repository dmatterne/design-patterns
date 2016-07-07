package be.david.adapter;

/**
 * Created by stannisbaratheon on 07/07/16.
 */
public class MphToKphSpeedoMeterAdapter implements SpeedoMeter {

    private static final double KM_PER_MILE = 1.6;

    private MilesPerHourSpeedoMeter adaptee;

    public MphToKphSpeedoMeterAdapter(MilesPerHourSpeedoMeter adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int getSpeed() {
        double mph = adaptee.getSpeedInMilesPerHour();
        int kph = (int) Math.round(mph * KM_PER_MILE);
        return kph;
    }
}

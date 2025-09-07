package Strategy;

public class ElectricMotorMotion implements IMotorized
{
    boolean batteryCharged;

    @Override
    public void start()
    {
        if (!isBatteryCharged())
            chargeBattery();
        System.out.println("Electric motor is working");
    }

    public boolean isBatteryCharged(){return batteryCharged;}

    public void chargeBattery() {batteryCharged = true;}
}

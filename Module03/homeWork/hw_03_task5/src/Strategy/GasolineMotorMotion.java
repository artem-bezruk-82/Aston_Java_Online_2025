package Strategy;

public class GasolineMotorMotion implements IMotorized
{
    private boolean tankRefueled;

    public boolean isTankRefueled() {return tankRefueled;}

    public void refuelTank() {tankRefueled = true;}

    @Override
    public void start()
    {
        if (!isTankRefueled())
            refuelTank();
        System.out.println("Gasoline motor is working");
    }
}

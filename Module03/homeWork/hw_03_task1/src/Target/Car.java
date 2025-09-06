package Target;

public class Car extends Vehicle implements IDrivable
{
    private boolean isRefueled;
    private boolean isEngineOn;

    public boolean isRefueled() {return isRefueled;}
    public boolean isEngineOn() {return isEngineOn;}
    public void refuel() {isRefueled = true;}

    public void engineStartStop() {isEngineOn = !isEngineOn;}

    @Override
    public void drive()
    {
        if (!isRefueled)
            refuel();
        if (!isEngineOn)
            engineStartStop();
        makeMove();
    }

    @Override
    public void makeMove()
    {
        if (isEngineOn && isRefueled)
            System.out.println("Car is moving");
        else
            System.out.println("Car can not move move. Please check fuel and engine");
    }
}

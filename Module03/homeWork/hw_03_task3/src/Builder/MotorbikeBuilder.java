package Builder;

import Products.Motorbike;
import Products.Vehicle;
import Products.parts.*;

public class MotorbikeBuilder implements IVehicleBuilder
{
    private Motorbike motorbike;

    public MotorbikeBuilder()
    {
        motorbike = new Motorbike();
    }

    @Override
    public void setManufacturer() {motorbike.setManufacturer("Java");}

    @Override
    public void insertWheels()
    {
        motorbike.add(new Wheel("Front wheel"));
        motorbike.add(new Wheel("Back wheel"));
    }

    public void installBody() {motorbike.add(new Body("Motorbike body"));}

    public void insertMotor() {motorbike.add(new Motor("Motor"));}

    @Override
    public Vehicle getVehicle() {return motorbike;}
}

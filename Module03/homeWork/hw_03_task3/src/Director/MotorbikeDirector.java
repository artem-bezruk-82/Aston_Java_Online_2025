package Director;

import Builder.IVehicleBuilder;
import Builder.MotorbikeBuilder;
import Products.Vehicle;

public class MotorbikeDirector implements IVehicleDirector
{
    @Override
    public Vehicle instruct(IVehicleBuilder builder)
    {
        builder.setManufacturer();
        builder.insertWheels();
        ((MotorbikeBuilder)builder).insertMotor();
        ((MotorbikeBuilder)builder).installBody();
        return builder.getVehicle();
    }
}

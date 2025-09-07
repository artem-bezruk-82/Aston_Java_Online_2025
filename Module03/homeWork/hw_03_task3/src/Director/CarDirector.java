package Director;

import Builder.CarBuilder;
import Builder.IVehicleBuilder;
import Products.Vehicle;

public class CarDirector implements IVehicleDirector
{
    @Override
    public Vehicle instruct(IVehicleBuilder builder)
    {
        builder.setManufacturer();
        builder.insertWheels();
        ((CarBuilder) builder).installCabin();
        ((CarBuilder) builder).insertEngin();
        return builder.getVehicle();
    }
}

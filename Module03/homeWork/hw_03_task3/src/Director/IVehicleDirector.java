package Director;

import Builder.IVehicleBuilder;
import Products.Vehicle;

public interface IVehicleDirector
{
    Vehicle instruct(IVehicleBuilder builder);
}

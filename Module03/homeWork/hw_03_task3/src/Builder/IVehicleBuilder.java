package Builder;

import Products.Vehicle;

public interface IVehicleBuilder
{
    void setManufacturer();
    void insertWheels();
    Vehicle getVehicle();
}

package Builder;

import Products.Car;
import Products.Vehicle;
import Products.parts.*;


public class CarBuilder implements IVehicleBuilder
{
    private Car car;

    public CarBuilder()
    {
        car = new Car();
    }

    @Override
    public void setManufacturer() {car.setManufacturer("Lada");}

    @Override
    public void insertWheels()
    {
        car.add(new Wheel("Front left wheel"));
        car.add(new Wheel("Front right wheel"));
        car.add(new Wheel("Back left wheel"));
        car.add(new Wheel("Back right wheel"));
    }

    public void installCabin() {car.add(new Cabin("Car cabin"));}

    public void insertEngin() {car.add(new Engine("Engine"));}

    @Override
    public Vehicle getVehicle() {return car;}
}

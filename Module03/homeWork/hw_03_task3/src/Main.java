// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 3
// Реализовать паттерн "Строитель"

import Builder.CarBuilder;
import Builder.IVehicleBuilder;
import Builder.MotorbikeBuilder;
import Director.CarDirector;
import Director.IVehicleDirector;
import Director.MotorbikeDirector;
import Products.Vehicle;

public class Main
{
    public static void main(String[] args)
    {
        IVehicleBuilder builder = new CarBuilder();
        IVehicleDirector director = new CarDirector();
        Vehicle vehicle = director.instruct(builder);
        System.out.println(vehicle);

        builder = new MotorbikeBuilder();
        director = new MotorbikeDirector();
        vehicle = director.instruct(builder);
        System.out.println(vehicle);

    }
}
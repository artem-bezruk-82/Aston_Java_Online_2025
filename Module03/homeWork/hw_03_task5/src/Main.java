// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 5
// Реализовать паттерн "Стратегия"

import Strategy.ElectricMotorMotion;
import Strategy.GasolineMotorMotion;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car(new GasolineMotorMotion());
        car.move();
        car.setMotionType(new ElectricMotorMotion());
        car.move();
    }
}

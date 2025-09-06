// Aston
// Java
// Online
// Module: 3
// Homework
// Task: 1
// Реализовать паттерн "Адаптер"

import Adaptee.Horse;
import Adapter.RideableToDrivableAdapter;
import Client.Traveler;
import Target.Car;

public class Main
{
    public static void main(String[] args)
    {
        Traveler traveler = new Traveler();
        traveler.travel(new Car());
        traveler.travel(new RideableToDrivableAdapter(new Horse()));
    }
}
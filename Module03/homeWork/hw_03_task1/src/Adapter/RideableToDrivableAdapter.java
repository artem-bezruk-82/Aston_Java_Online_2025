package Adapter;

import Adaptee.IRideable;
import Target.IDrivable;

public class RideableToDrivableAdapter implements IDrivable
{
    IRideable rideableAnimal;

    public RideableToDrivableAdapter(IRideable rideableAnimal)
    {
        this.rideableAnimal = rideableAnimal;
    }

    @Override
    public void drive() {rideableAnimal.ride();}
}

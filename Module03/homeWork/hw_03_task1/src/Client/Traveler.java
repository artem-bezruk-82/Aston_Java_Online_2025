package Client;

import Target.IDrivable;

public class Traveler extends Human
{
    public void travel(IDrivable transport) {transport.drive();}

}

package Products;

public class Motorbike extends Vehicle
{
    @Override
    public String toString()
    {
        return String.format("Vehicle: Motorbike %s", super.toString());
    }
}

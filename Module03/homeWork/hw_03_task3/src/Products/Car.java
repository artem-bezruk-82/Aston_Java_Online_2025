package Products;

public class Car extends Vehicle
{
    @Override
    public String toString()
    {
        return String.format("Vehicle: Car %s", super.toString());
    }
}

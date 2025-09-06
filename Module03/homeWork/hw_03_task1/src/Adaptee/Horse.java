package Adaptee;

public class Horse extends Animal implements IRideable
{
    private boolean isHungry;

    public boolean isHungry() {return isHungry;}

    @Override
    public void move()
    {
        System.out.println(isHungry ? "Horse is hungry" : "Horse is galloping");
    }

    @Override
    public void eat() {isHungry = false;}

    @Override
    public void ride()
    {
        if (isHungry)
            eat();
        move();
    }
}

import Strategy.IMotorized;

public class Car extends Vehicle
{
    IMotorized motionType;

    public Car(IMotorized motionType) {this.motionType = motionType;}

    public IMotorized getMotionType() {return motionType;}

    public void setMotionType(IMotorized motionType) {this.motionType = motionType;}

    @Override
    public void move()
    {
        motionType.start();
        System.out.println("Car is moving");
    }
}

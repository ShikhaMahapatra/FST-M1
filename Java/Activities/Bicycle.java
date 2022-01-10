package activities;

public class Bicycle implements BicycleParts,BicycleOperations{
    int gears,speed;
    Bicycle(int gears,int currentSpeed)
    {
        this.gears=gears;
        this.speed=currentSpeed;
    }

    @Override
    public void applyBrake(int decrement) {
        speed=speed-decrement;
    System.out.println("Speed is reduced to "+ speed);
    }
    @Override
    public void speedUp(int increment) {
        speed=speed+increment;
        System.out.println("Speed is increased "+speed);
    }
    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + speed);
    }
}

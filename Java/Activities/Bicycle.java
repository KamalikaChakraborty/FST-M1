package activities;

public class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int currentSpeed;
    Bicycle(int gears, int currentSpeed) {
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        currentSpeed = currentSpeed - decrement;
        System.out.println("Speed after break: " + currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
        currentSpeed = currentSpeed + increment;
        System.out.println("Speed after speed up: " + currentSpeed);
    }

    public String bicycleDesc() {
        return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
    }
}

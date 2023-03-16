// create a driver class that extends the car class
public class Driver extends Car {
    // each method should print the action to the console, followed by the remaining amount of gas
    // ...drive,
    public void drive() {
        Driver.gasLevel--;
        System.out.println("Driver is driving.");
        System.out.println("Gas Remaining = " + Driver.gasRemaining() + "/10");
    }
    // ...use boosters,
    public void useBoosters() {
        Driver.gasLevel -= 3;
        System.out.println("Driver is using boosters.");
        System.out.println("Gas Remaining = " + Driver.gasRemaining() + "/10");
    }
    // ...refuel.
    public void refuel() {
        Driver.gasLevel += 2;
        System.out.println("Driver is refueling.");
        System.out.println("Gas Remaining = " + Driver.gasRemaining() + "/10");
    }
}
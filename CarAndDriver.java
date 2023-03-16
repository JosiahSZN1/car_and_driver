public class CarAndDriver {
    public static void main(String[] args) {
        // Instantiate the driver class...
        Driver babyDriver = new Driver();
        // Drive four times.
        babyDriver.drive();
        babyDriver.drive();
        babyDriver.drive();
        babyDriver.drive();
        // Use boosters once.
        babyDriver.useBoosters();
        // Refuel three times.
        babyDriver.refuel();
        babyDriver.refuel();
        babyDriver.refuel();
    }
}
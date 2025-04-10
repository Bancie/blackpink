package Vehicle;
import Vehicle.*;

class Bike extends Vehicle {
    // public Bike () {
    //     super("Bike", 2, 0);
    // }

    public Bike (String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive () {
        System.out.println("Bike drive");
    }

    @Override
    public double getFuelEfficiency () {
        return fuelEfficiency;
    }
}

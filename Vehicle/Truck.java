package Vehicle;
import Vehicle.*;

class Truck extends Vehicle {

    public Truck (String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive () {
        System.out.println("Truck drive");
    }

    @Override
    public double getFuelEfficiency () {
        return fuelEfficiency;
    }
}
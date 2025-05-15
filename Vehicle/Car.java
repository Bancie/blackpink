package Vehicle;
import Vehicle.*;

class Car extends Vehicle {

    public Car (String name, int wheels, double fuelEfficiency) {
        super(name, wheels, fuelEfficiency);
    }

    @Override
    public void drive () {
        System.out.println("Car drive");
    }

    @Override
    public double getFuelEfficiency () {
        return fuelEfficiency;    
    }
}
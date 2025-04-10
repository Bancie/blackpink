package Vehicle;

public abstract class Vehicle {
    String name;
    int wheels;
    double fuelEfficiency;

    public Vehicle (String name, int wheels, double fuelEfficiency) {
        this.name = name;
        this.wheels = wheels;
        this.fuelEfficiency = fuelEfficiency;
    }
    
    abstract void drive();
    abstract double getFuelEfficiency();
    public void printInfo() {
        System.out.println("Ten: " + name + " Banh: " + wheels + " Hieu suat: " + fuelEfficiency);
    }
}
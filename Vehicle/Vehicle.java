package Vehicle;
import java.util.ArrayList;
import java.util.List;

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

class Car extends Vehicle {
    public Car () {
        super("Car", 4, 15);
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

class Bike extends Vehicle {
    public Bike () {
        super("Bike", 2, 0);
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

class Truck extends Vehicle {
    public Truck () {
        super("Truck", 6, 8);
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

class testVehicle {
    public static void main(String[] args) {
        List <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new Bike());
        vehicles.add(new Truck());

        Vehicle v = vehicles.get(0);
        v.drive();
        
        for (Vehicle i : vehicles) {
            i.drive();
            i.printInfo();
        }
    }
}
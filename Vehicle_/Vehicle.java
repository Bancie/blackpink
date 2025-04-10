package Vehicle_;

public abstract class Vehicle {
    protected String brand;
    protected double speed;

    abstract double accelerate(double value);
    // abstract double brake();

    public void information(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public void displayStatus(String brand, double speed) {
        System.out.println("Brand: " + brand + " Speed: " + speed);
    }
}

class car extends Vehicle {
    public double accelerate(double value) {
        return speed + value;
    }
}

class Main {
    public static void main(String[] args) {
        car obj = new car();
        obj.accelerate(15);
    }
}
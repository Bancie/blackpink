package Vehicle;
import java.util.ArrayList;
import java.util.List;
import Vehicle.*;

public class Run {
    public static void main(String[] args) {
        List <Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Car", 4, 15));
        vehicles.add(new Bike("Bike", 2, 0));
        vehicles.add(new Truck("Truck", 6, 8));

        Vehicle v = vehicles.get(0);
        v.drive();
        
        for (Vehicle i : vehicles) {
            i.drive();
            i.printInfo();
        }
    }
}
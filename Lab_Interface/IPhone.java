package Lab_Interface;
import Lab_Interface.Switchable;

public class IPhone implements Switchable {
    public void turnOn() {
        System.out.println("iPhone turned on");
    }

    public void turnOff() {
        System.out.println("iPhone turned off");
    }
}

class IphoneTest {
    public static void main(String[] args) {
        Switchable ip = new IPhone();
        ip.turnOn();
        ip.turnOff();
    }
}
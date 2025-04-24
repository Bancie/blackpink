package Lab_Interface;
import Lab_Interface.Connectable;

public class Samsung implements Connectable {
    public void connectToInternet(String network) {
        System.out.println("Samsung connected to " + network);
    }
}

class SamsungTest {
    public static void main(String[] args) {
        Connectable ss = new Samsung();
        ss.connectToInternet("5G");
    }
}
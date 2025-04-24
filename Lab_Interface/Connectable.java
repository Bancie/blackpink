package Lab_Interface;

public interface Connectable {
    void connectToInternet(String network);
}

public class Samsung implements Connectable {
    public void connectToInternet(String network) {
        System.out.println("Samsung connected to " + network);
    }
}

class SamsungTest {
    public static void main(String[] args) {
        
    }
}
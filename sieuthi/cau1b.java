package sieuthi;
import sieuthi.Class.Grocery;

public class cau1b {
    public static void main(String[] args) {
        Grocery g = new Grocery("Rice", 20000, 50);
        System.out.println(g.calculateTotalPrice());
        g.showDetails();
    }
}

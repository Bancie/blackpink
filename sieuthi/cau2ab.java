package sieuthi;
import sieuthi.Class.*;
import sieuthi.Interface.IBillable;
import java.util.ArrayList;
import java.util.List;

public class cau2ab {
    public static void main(String[] args) {
        List <IBillable> sp = new ArrayList<>();
        IBillable grocery = new Grocery("keo", 3000, 50);
        IBillable apparel = new Apparel("PNJ", 1000000, "bong tai");
        IBillable stationery = new Stationery("Viet", 6000, 32);
        sp.add(grocery);
        sp.add(apparel);
        sp.add(stationery);
        double sum = 0;
        for (IBillable i : sp) {
            sum += i.calculateTotalPrice();
        }
        System.out.println(sum);
    }
}

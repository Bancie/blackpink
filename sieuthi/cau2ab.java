package sieuthi;
import java.util.ArrayList;
import java.util.List;

import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;
import sieuthi.Interface.IBillable;

public class cau2ab {
    public static void main(String[] args) {
        List <IBillable> sp = new ArrayList<>();
        Grocery grocery = new Grocery("keo", 3000, 50);
        Apparel apparel = new Apparel("PNJ", 1000000, "bong tai");
        Stationery stationery = new Stationery("Viet", 6000, 32);
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

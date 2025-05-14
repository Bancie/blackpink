package sieuthi;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;
import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

class nhan6<T extends IBillable> {
    private List<T> ds = new ArrayList<>();

    public void them(T a) {
        ds.add(a);
    }

    public void tonggia(double nguong) {
        for (T i : ds) {
            if (i.calculateTotalPrice() > nguong) {
                if (i instanceof Grocery) {
                    Grocery j = (Grocery) i;
                    j.showDetails();
                } else if (i instanceof Stationery) {
                    Stationery k = (Stationery) i;
                    k.showDetails();
                } else if (i instanceof Apparel) {
                    Apparel a = (Apparel) i;
                    a.showDetails();
                }
            }
        }
    }
}

public class cau6 {
    public static void main(String[] args) {
        nhan6<IBillable> n = new nhan6<>();
        IBillable grocery = new Grocery("Keo", 300, 55000);
        IBillable stationery = new Stationery("Viet", 6, 10);
        IBillable apperal = new Apparel("PNJ", 300000000, "Nhan");
        n.them(grocery);
        n.them(stationery);
        n.them(apperal);
        n.tonggia(500000);
    }
}

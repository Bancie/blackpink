package sieuthi;

import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;

import Means.app;
import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

class nhan5 {
    private List<IShowable> ds1 = new ArrayList<>();

    public void them(IShowable a) {
        ds1.add(a);
    }

    public void in() {
        for (IShowable i : ds1) {
            if (i instanceof Grocery) {
                i.showDetails();
            } else if (i instanceof Apparel) {
                i.showDetails();
                System.out.println("This is an apparel item.");
            }
        }
    }
}

public class cau5 {
    public static void main(String[] args) {
        nhan5 n = new nhan5();
        IShowable grocery = new Grocery("Keo", 3000, 550);
        IShowable apperal = new Apparel("PNJ", 3000000, "Nhan");
        n.them(grocery);
        n.them(apperal);
        n.in();
    }
}

package sieuthi;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;
import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

<<<<<<< HEAD
class nhan6<T1 extends IBillable, T2 extends IBillable, T3 extends IBillable> {
    private List<T1> ds1 = new ArrayList<>();
    private List<T2> ds2 = new ArrayList<>();
    private List<T3> ds3 = new ArrayList<>();

    public void themGrocery(T1 a) {
        ds1.add(a);
    }

    public void themApperal(T2 a) {
        ds2.add(a);
    }

    public void themStationery(T3 a) {
        ds3.add(a);
=======
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
>>>>>>> parent of cdd992b (up)
    }
}

public class cau6 {
    public static void main(String[] args) {
<<<<<<< HEAD

=======
        nhan6<IBillable> n = new nhan6<>();
        IBillable grocery = new Grocery("Keo", 300, 55000);
        IBillable stationery = new Stationery("Viet", 6, 10);
        IBillable apperal = new Apparel("PNJ", 300000000, "Nhan");
        n.them(grocery);
        n.them(stationery);
        n.them(apperal);
        n.tonggia(500000);
>>>>>>> parent of cdd992b (up)
    }
}

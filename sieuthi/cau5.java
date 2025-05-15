package sieuthi;

import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;

import Means.app;
import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

<<<<<<< HEAD
class nhan5<T1 extends IShowable> {
    private List<T1> ds1 = new ArrayList<>();

    public void them(T1 a) {
=======
class nhan5 {
    private List<IShowable> ds1 = new ArrayList<>();

    public void them(IShowable a) {
>>>>>>> parent of cdd992b (up)
        ds1.add(a);
    }

    public void in() {
<<<<<<< HEAD
        for (T1 i : ds1) {
            if (i instanceof Grocery) {
                i.showDetails();
            }
            if (i instanceof Apparel) {
=======
        for (IShowable i : ds1) {
            if (i instanceof Grocery) {
                i.showDetails();
            } else if (i instanceof Apparel) {
>>>>>>> parent of cdd992b (up)
                i.showDetails();
                System.out.println("This is an apparel item.");
            }
        }
    }
}

public class cau5 {
    public static void main(String[] args) {
<<<<<<< HEAD
        nhan5<IShowable> n = new nhan5<>();
=======
        nhan5 n = new nhan5();
>>>>>>> parent of cdd992b (up)
        IShowable grocery = new Grocery("Keo", 3000, 550);
        IShowable apperal = new Apparel("PNJ", 3000000, "Nhan");
        n.them(grocery);
        n.them(apperal);
        n.in();
    }
}

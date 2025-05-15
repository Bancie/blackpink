package sieuthi;

import java.util.ArrayList;
import java.util.List;
import sieuthi.Interface.ITrackable;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

class nhan3<T1 extends ITrackable> {
    private List<T1> ds1 = new ArrayList<>();

    public void them(T1 a) {
        ds1.add(a);
    }

    public void show() {
        for (T1 i : ds1) {
            if (i.getUnitsSold() > 100) {
                if (i instanceof Grocery) {
                    Grocery isub = (Grocery) i;
                    isub.showDetails();
                } else if (i instanceof Stationery) {
                    Stationery isub = (Stationery) i;
                    isub.showDetails();
                }
            }
        }
    }
}

public class cau3ab {
    public static void main(String[] args) {
        nhan3<ITrackable> n = new nhan3<>();
        ITrackable grocery = new Grocery("keo", 3000, 550);
        ITrackable stationery = new Stationery("Viet", 6000, 999);
        n.them(grocery);
        n.them(stationery);
        n.show();
    }
}

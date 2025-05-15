package sieuthi;

import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

class nhan4 {
    private List<ITrackable> ds = new ArrayList<>();

    public void them(ITrackable a) {
        ds.add(a);
    }

    public void soluongban() {
        if (ds.isEmpty()) {
            throw new IllegalStateException("Ds rong");
        }

        ITrackable maxds = ds.get(0);

        for (ITrackable i : ds) {
            if (i.getUnitsSold() > maxds.getUnitsSold()) {
                maxds = i;
            }
        }
        if (maxds instanceof Grocery) {
            Grocery g = (Grocery) maxds;
            g.showDetails();
        } else if (maxds instanceof Stationery) {
            Stationery s = (Stationery) maxds;
            s.showDetails();
        }
    }
}

public class cau4ab {
    public static void main(String[] args) {
        nhan4 n = new nhan4();
        ITrackable grocery = new Grocery("Keo", 3000, 5500);
        ITrackable stationery = new Stationery("Viet", 6000, 1000);
        ITrackable stationery2 = new Stationery("Tap", 5000, 1000);
        n.them(grocery);
        n.them(stationery);
        n.them(stationery2);
        n.soluongban();
    }
}

package sieuthi;
import java.util.ArrayList;
import java.util.List;
import sieuthi.Interface.ITrackable;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;
import sieuthi.Interface.IShowable;

class nhan <T1 extends ITrackable & IShowable, T2 extends ITrackable> {
    private List <T1> ds1 = new ArrayList<>();
    private List <T2> ds2 = new ArrayList<>();

    public void themGrocery(T1 a) {
        ds1.add(a);
    }

    public void themStationery(T2 a) {
        ds2.add(a);
    }
    
    public void show() {
        for (T1 i : ds1) {
            if (i.getUnitsSold() > 100) {
                i.showDetails();
            }
        }
        for (T2 i : ds2) {
            if (i.getUnitsSold() > 100) {
                Stationery isub = (Stationery) i;
                isub.showDetails();
            }
        }
    }
}

public class cau3ab {
    public static void main(String[] args) {
        nhan n = new nhan();
        ITrackable grocery = new Grocery("keo", 3000, 550);
        ITrackable stationery = new Stationery("Viet", 6000, 300);
        n.themGrocery(grocery);
        n.themStationery(stationery);
        n.show();
    }
}

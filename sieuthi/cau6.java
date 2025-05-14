package sieuthi;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;
import java.util.ArrayList;
import java.util.List;
import sieuthi.Class.Apparel;
import sieuthi.Class.Grocery;
import sieuthi.Class.Stationery;

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
    }
}

public class cau6 {
    public static void main(String[] args) {

    }
}

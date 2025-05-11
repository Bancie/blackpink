package sieuthi.Class;
import java.util.ArrayList;

public class mang {
    protected ArrayList <Grocery> ds = new ArrayList<>();

    public void them(Grocery a) {
        a = new Grocery(null, 0, 0);
        ds.add(a);
    }

    public void tongtien () {
        double sum = 0;
        for (Grocery i : ds) {
            sum += i.getpricePerUnit();
        }
        System.out.println(sum);
    }
}

class testds {
    public static void main(String[] args) {
        mang d = new mang();
        Grocery t1 = new Grocery("a", 4, 2);
        Grocery t2 = new Grocery("b", 9, 2);
        d.them(t1);
        d.them(t2);
        d.tongtien();
    }
}
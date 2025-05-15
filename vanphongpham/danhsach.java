package vanphongpham;
import vanphongpham.*;
import java.util.ArrayList;
import java.util.Scanner;

public class danhsach {
    protected ArrayList <vpp> ds = new ArrayList<>();
    protected int soluong;

    public danhsach (int soluong) {
        this.soluong = soluong;
    }

    public void them() {
        vpp a;
        Scanner sc = new Scanner(System.in);
        for (int i=0; i< this.soluong; i++) {
            String loai = sc.nextLine();
            if (loai.equals("tap")) {
                a = new tap(null, null, 0, 0);
            } else {
                a = new viet(null, null, 0, null);
            }
            a.nhap();
            ds.add(a);
        }
    }

    public void xuat() {
        for (vpp i : ds) {
            i.xuat();
        }
    }

    public void timkiem () {
        double min = Double.MAX_VALUE;
        for (vpp i : ds) {
            if (i.getDongia() < min) {
                min = i.getDongia();
            }
        }
        for (vpp i : ds) {
            if (min == i.getDongia()) {
                i.xuat();
            }
        }
    }
}

class testds {
    public static void main (String[] args) {
        danhsach d = new danhsach(2);
        d.them();
        d.xuat();
        d.timkiem();
    }
}
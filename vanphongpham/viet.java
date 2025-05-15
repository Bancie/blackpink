package vanphongpham;
import java.util.Scanner;

import vanphongpham.vpp;

public class viet extends vpp {
    protected String maumuc;
    public viet (String mavpp, String tenvpp, double dongia, String maumuc) {
        super(mavpp, tenvpp, dongia);
        this.maumuc = maumuc;
    }

    @Override
    public void nhap () {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        this.maumuc = sc.nextLine();
    }

    @Override
    public void xuat () {
        super.xuat();
        System.out.println("mau muc:" + this.maumuc);
    }

    public double getDongia () {
        return this.dongia;
    }
}

class testviet {
    public static void main (String[] args) {
        viet t = new viet(null, null, 0, null);
        t.nhap();
        t.xuat();
    }
}
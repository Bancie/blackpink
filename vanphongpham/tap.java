package vanphongpham;
import java.util.Scanner;

import vanphongpham.vpp;

public class tap extends vpp {
    protected int sotrang;
    public tap (String mavpp, String tenvpp, double dongia, int sotrang) {
        super(mavpp, tenvpp, dongia);
        this.sotrang = sotrang;
    }

    @Override
    public void nhap () {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        this.sotrang = sc.nextInt();
    }

    @Override
    public void xuat () {
        super.xuat();
        System.out.println("so trang:" + this.sotrang);
    }
}

class testtap {
    public static void main (String[] args) {
        tap t = new tap(null, null, 0, 0);
        t.nhap();
        t.xuat();
    }
}
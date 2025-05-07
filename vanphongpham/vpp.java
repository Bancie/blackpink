package vanphongpham;
import java.util.Scanner;

public class vpp {
    protected String mavpp;
    protected String tenvpp;
    protected double dongia;
    
    public vpp (String mavpp, String tenvpp, double dongia) {
        this.mavpp = mavpp;
        this.tenvpp = tenvpp;
        this.dongia = dongia;
    }

    public void nhap () {
        Scanner sc = new Scanner(System.in);
        this.mavpp = sc.nextLine();
        this.tenvpp = sc.nextLine();
        this.dongia = sc.nextDouble();
    }

    public void xuat () {
        System.out.println("Ma vpp: " + this.mavpp + "Ten vpp: " + this.tenvpp + "Don gia: " + this.dongia);
    }

    public double getDongia () {
        return this.dongia;
    }
}

class test {
    public static void main(String[] args) {
        vpp v = new vpp(null, null, 0);
        v.nhap();
        v.xuat();
    }
}
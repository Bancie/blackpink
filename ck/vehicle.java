package ck;
import java.util.Scanner;

class vehicle {
    String maphuongtien;
    String tenphuongtien;
    String hangsx;
    int sldk;
    public vehicle (String maphuongtien, String tenphuongtien, String hangsx, int sldk) {
        this.maphuongtien = maphuongtien;
        this.tenphuongtien = tenphuongtien;
        this.hangsx = hangsx;
        this.sldk = sldk;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        this.maphuongtien = s.nextLine();
        s.nextLine();
        this.tenphuongtien = s.nextLine();
        s.nextLine();
        this.hangsx = s.nextLine();
        s.nextLine();
        this.sldk = s.nextInt();
    }

    public void xuat() {
        System.out.println(this.maphuongtien + this.tenphuongtien + this.hangsx + this.sldk);
    }
}

class Car extends vehicle {
    int sochongoi;
    String loaidongco;
    
    public Car (String maphuongtien, String tenphuongtien, String hangsx, int sldk, int sochongoi, String loaidongco) {
        super(maphuongtien, tenphuongtien, hangsx, sldk);
        this.sochongoi = sochongoi;
        this.loaidongco = loaidongco;
    }

    @Override
    public void nhap() {
        Scanner s = new Scanner(System.in);
        super.nhap();
        s.nextLine();
        this.sochongoi = s.nextInt();
        this.loaidongco = s.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println(this.sochongoi + this.loaidongco);
    }
}

class Motorbike extends vehicle {
    double dungtichxilanh;
    public Motorbike (String maphuongtien, String tenphuongtien, String hangsx, int sldk, double dungtichxilanh) {
        super(maphuongtien, tenphuongtien, hangsx, sldk);
        this.dungtichxilanh = dungtichxilanh;
    }
    @Override
    public void nhap() {
        Scanner s = new Scanner(System.in);
        super.nhap();
        s.nextLine();
        this.dungtichxilanh = s.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println(this.dungtichxilanh);
    }
}

class danhsach {
    public static void main(String[] args) {
        vehicle a = new Motorbike("a", "b", "c", 7, 8);
        System.out.println(a.sldk);
    }
}
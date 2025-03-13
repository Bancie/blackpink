package Quanly;

public class NhanSu {

    public String ten;
    public int namsinh;

    public NhanSu(String ten, int namsinh) {
        this.ten = ten;
        this.namsinh = namsinh;
    }

    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh);
    }

    public static void main(String[] args) {
        NhanSu tt = new NhanSu("Nguyen Thi Yen", 2003);
        tt.thongtin();
    }
}

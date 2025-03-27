package Quanly;

public class NhanSu {

    public String ten;
    public String ngheNghiep;
    public int namsinh;
    private String phoneNumber;

    public NhanSu(String ten, String ngheNghiep, int namsinh, String phoneNumber) {
        this.ten = ten;
        this.ngheNghiep = ngheNghiep;
        this.namsinh = namsinh;
        this.phoneNumber = phoneNumber;
    }

    public NhanSu(NhanSu original) {
        this.ten = original.ten;
        this.ngheNghiep = original.ngheNghiep;
        this.namsinh = original.namsinh;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh + " Sdt: " + phoneNumber);
    }
}

class NhanSuTest {
    public static void main(String[] args) {
        NhanSu tt = new NhanSu("Nguyen Thi Yen", "Sinh Vien", 2003, "0832946009");
        NhanSu tt2 = new NhanSu(tt);
        tt.thongtin();
        tt2.setPhoneNumber("696969");
        tt2.thongtin();
        System.out.println(tt2.getPhoneNumber());
    }
}

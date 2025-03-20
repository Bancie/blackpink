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

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh + " Sdt: " + phoneNumber);
    }

    public static void main(String[] args) {
        NhanSu tt = new NhanSu("Nguyen Thi Yen", "Sinh Vien", 2003, "0832946009");
        tt.thongtin();
    }
}

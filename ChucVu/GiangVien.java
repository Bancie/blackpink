package ChucVu;
import Quanly.NhanSu;

public class GiangVien extends NhanSu {
    
    public String chuyenmon;
    
    GiangVien(String ten, String ngheNghiep, int namsinh, String phoneNumber, String chuyenmon) {
        super(ten, ngheNghiep, namsinh, phoneNumber);
        this.chuyenmon = chuyenmon;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nghe nghiep: " + ngheNghiep + " Nam sinh: " + namsinh + " Sdt: " + getPhoneNumber() + " chuyenmon: " + chuyenmon);
    }

    public static void main(String[] args) {
        GiangVien ns = new GiangVien("Phien", "Giang vien", 1985, "08348264", "30");
        ns.thongtin();
    }
}

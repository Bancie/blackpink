package ChucVu;
import Quanly.NhanSu;

public class SinhVien extends NhanSu {
    
    public String diem;

    SinhVien(String ten, String ngheNghiep, int namsinh, String phoneNumber, String diem) {
        super(ten, ngheNghiep, namsinh, phoneNumber);
        this.diem = diem;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nghe nghiep: " + ngheNghiep + " Nam sinh: " + namsinh + " Sdt: " + getPhoneNumber() + " Diem: " + diem);
    }

    public static void main(String[] args) {
        SinhVien sv = new SinhVien("Yen", "Sinh Vien", 2003, "80329434", "30");
        sv.thongtin();
    }
}

package ChucVu;
import Quanly.NhanSu;

public class SinhVien extends NhanSu {
    
    public String diem;
    
    SinhVien(String ten, int namsinh, String diem) {
        super(ten, namsinh);
        this.diem = diem;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh + " Diem: " + diem);
    }

    public static void main(String[] args) {
        SinhVien ns = new SinhVien("Yen", 2003, "30");
        ns.thongtin();
    }
}

package ChucVu;
import Quanly.NhanSu;

public class GiangVien extends NhanSu {
    
    public String chuyenmon;
    
    GiangVien(String ten, int namsinh, String chuyenmon) {
        super(ten, namsinh);
        this.chuyenmon = chuyenmon;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh + " chuyenmon: " + chuyenmon);
    }

    public static void main(String[] args) {
        GiangVien ns = new GiangVien("Yen", 2003, "30");
        ns.thongtin();
    }
}

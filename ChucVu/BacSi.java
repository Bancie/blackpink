package ChucVu;
import Quanly.NhanSu;

public class BacSi extends NhanSu {
    
    public String chuyenkhoa;
    
    BacSi(String ten, int namsinh, String chuyenkhoa) {
        super(ten, namsinh);
        this.chuyenkhoa = chuyenkhoa;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nam sinh: " + namsinh + " Chuyen khoa: " + chuyenkhoa);
    }

    public static void main(String[] args) {
        BacSi ns = new BacSi("Yen", 2003, "Tai mui hong");
        ns.thongtin();
    }
}

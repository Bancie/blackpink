package ChucVu;
import Quanly.NhanSu;

public class BacSi extends NhanSu {
    
    public String chuyenkhoa;
    
    BacSi(String ten, String ngheNghiep, int namsinh, String phoneNumber, String chuyenkhoa) {
        super(ten, ngheNghiep, namsinh, phoneNumber);
        this.chuyenkhoa = chuyenkhoa;
    }

    @Override
    public void thongtin() {
       System.out.println("Ten: " + ten + " Nghe nghiep: " + ngheNghiep + "Nam sinh: " + namsinh + " Sdt: " + getPhoneNumber() + " Chuyen khoa: " + chuyenkhoa);
    }

    public static void main(String[] args) {
        BacSi bs = new BacSi("Yen", "Bac si", 2003,"012834", "Tai mui hong");
        bs.thongtin();
    }
}

package ChucVu;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> individual = new ArrayList<>();
        GiangVien gv = new GiangVien("Phieu", "Giang vien", 2003, "09234235", "30");
        SinhVien sv = new SinhVien("Yen", "Sinh vien", 2003, "08237423", "30");
        BacSi bs = new BacSi("Khoi", "Bac si", 2003, "0238433243", "Tai mui hong");
        gv.thongtin();
        sv.thongtin();
        bs.thongtin();
    }
}

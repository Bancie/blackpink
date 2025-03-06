import java.util.*;

class Hoso {
    static String ten;
    static int namsinh;

    public static void thongtin () {
        Scanner input = new Scanner(System.in);
        this.ten = ten;
        this.namsinh = namsinh;
        System.out.print("Nhap vao ten: ");
        ten = input.nextLine();
        System.out.print("Nhap vao nam sinh: ");
        namsinh = input.nextInt();
    }

    // public static int get_tuoi () {
    //     int tuoi = 2025 - namsinh;
    //     return tuoi;
    // }

    public static void show () {
        System.out.println("Ten: " + ten);
        // System.out.println("So tuoi: " + get_tuoi());
    }
}

public class QuanLy {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       Hoso[] nhanvien = new Hoso[2];
       for (Hoso a : nhanvien) {
            Hoso.thongtin();
       }

       for (Hoso a : nhanvien) {
            Hoso.show();
       }
    }
}

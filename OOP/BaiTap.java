import java.util.*;

class Pheptinh {
    Scanner input = new Scanner(System.in);

    void cong(int a, int b) {
        System.out.println(a+b);
    }
    void tru(int a, int b) {
        System.out.println(a-b);
    }
    void nhan(int a, int b) {
        System.out.println(a*b);
    }
    void chia(int a, int b) {
        System.out.println(a/b);
    }
    
    void summary(int a, int b) {
        int tong = 0;
        int tong_kq = 0;
        System.out.print("Nhap vao trang thai: ");
        String state = input.nextLine();
        tong = a + b;
        tong_kq = tong_kq + tong;
        while (!state.equals("stop")) {
            System.out.print("Nhap vao so: ");
            a = input.nextInt();
            System.out.print("Nhap vao so: ");
            b = input.nextInt();
            tong = a + b;
            tong_kq = tong_kq + tong;
            input.nextLine();
            System.out.print("Nhap vao trang thai: ");
            state = input.nextLine();
        }
        System.out.println(tong_kq);
    }

    int checking(int num){
        if (num < 10) {
            return num;
        }
        else {
            return num*2;
        }
    }
}

class ThucThi {
    Pheptinh giatri = new Pheptinh();
    Scanner input = new Scanner(System.in);

    void show (int num1, int num2) {
        System.out.print("Nhap vao phep tinh: ");
        String phep = input.nextLine();
        System.out.print("Ban co muon ket thuc? ");
        String again = input.nextLine();
        
        if (again.equals("co")) {
            if (phep.equals("a")) {
                giatri.cong(num1, num2);
            } else if (phep.equals("m")) {
                giatri.nhan(num1, num2);
            } else if (phep.equals("s")) {
                giatri.summary(num1, num2);
            }
        }

        while (!again.equals("co")) {
            if (phep.equals("a")) {
                giatri.cong(num1, num2);
            } else if (phep.equals("m")) {
                giatri.nhan(num1, num2);
            } else if (phep.equals("s")) {
                giatri.summary(num1, num2);
            }
            
            System.out.print("Nhap vao so: ");
            num1 = input.nextInt();
            System.out.print("Nhap vao so: ");
            num2 = input.nextInt();
            input.nextLine();
            System.out.print("Nhap vao phep tinh: ");
            phep = input.nextLine();
            
            System.out.print("Ban co muon ket thuc? ");
            again = input.nextLine();
        }
    }
}

public class BaiTap {
    public static void main(String[] args) {
        
        Pheptinh giatri = new Pheptinh();
        ThucThi thucthi = new ThucThi();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap vao so: ");
        int num1 = input.nextInt();
        System.out.print("Nhap vao so: ");
        int num2 = input.nextInt();

        thucthi.show(num1, num2);

    }


}
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

public class HelloWorld {
    public static void main(String[] args) {
        
        Pheptinh giatri = new Pheptinh();
        ThucThi thucthi = new ThucThi();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap vao so: ");
        int num1 = input.nextInt();
        System.out.print("Nhap vao so: ");
        int num2 = input.nextInt();

        thucthi.show(num1, num2);

        // ------------------------------------------------------
        // float sum = 0;
        // Scanner input = new Scanner(System.in);
        // System.out.print("Nhap vao so: ");
        // float n = input.nextFloat(); //nextLine() <-- String
        // while (n <= 100) {
        //     sum += n;
        //     System.out.print("Nhap vao so: ");
        //     n = input.nextFloat(); //nextLine() <-- String
        // }
        // System.out.println("Sum = " + sum);
        // ------------------------------------------------------
        // Scanner input = new Scanner(System.in);
        // int hon_da = 50;
        // double lit_nuoc = 10.11;
        // int xo_nuoc = (int) lit_nuoc;
        // char kytu = 'A';
        // boolean mua = true;
        // boolean nang = !mua;
        // String text = "Java Programming";
        // System.out.println("hon_da = " + hon_da);
        // System.out.println("lit_nuoc = " + lit_nuoc);
        // System.out.println("kytu = " + kytu);
        // System.out.println("mua = " + mua);
        // System.out.println("text = " + text);
        // System.out.println("So luong xo nuoc: " + xo_nuoc);
        // System.out.println("Bau troi nang: " + nang);
        // System.out.print("Nhap vao so luong hon da: ");
        // int hon_da_input = input.nextInt();
        // System.out.println("So luong hon da da nhap la " + hon_da_input);
        // System.out.print("So luong lit nuoc: ");
        // double lit_nuoc_input = input.nextFloat();
        // System.out.println("So lit nuoc da nhap la " + lit_nuoc_input);
        // System.out.print("Noi dung thu ban muon nhap: ");
        // String noi_dung_input = input.nextLine();
        // System.out.println("So lit nuoc da nhap la " + noi_dung_input);
        // double Tong = hon_da_input + lit_nuoc_input;
        // System.out.println("Tong = " + Tong);
        // ------------------------------------------------------
    }


}
import java.util.*;
import java.lang.Math;

class Tichphan {
    public static String nhap_function () {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap vao ham so: ");
        String function = input.nextLine();
        return function;
    }

    public static double function(double x) {
        return Math.exp(x*x + x - 3);
    }

    public static double hinhthang(double a, double b, int n) {
        double h = (b - a) / n;
        double sum = (function(a) + function(b)) / 2.0;

        for (int i = 1; i < n; i++) {
            double x = a + i * h;
            sum += function(x);
        }

        return sum * h;
    }
}

class bien_coban {

    public static double a_0 () {
        Tichphan tp = new Tichphan();
        double c = 1/(2*Math.PI);
        double kq = tp.hinhthang(-Math.PI, Math.PI, 1000);
        return c*kq;
    }
}

class khaitrien_fourier {
    public static int tong (int a, int b) {
        return a+b;
    }

    public static int tru (int a, int b) {
        return a-b;
    }

    public static double ketqua () {
        bien_coban bien = new bien_coban();
        return bien.a_0();
    }
}

public class Main {
    public static void main (String[] args) {
       Scanner input = new Scanner(System.in);
       khaitrien_fourier fourier = new khaitrien_fourier();

       System.out.println(fourier.ketqua());
    }
}
package GameNhanPham;
import java.util.Random;

public class Huong {
    private Random random;

    public Huong() {
        random = new Random();
    }

    public int NgauNhien(int min, int max) {
        /*
         * Method: NgauNhien
         *      parameters: 
         */
        Random randomm = new Random();
        return randomm.nextInt((max - min) + 1) + min;
    }

    public String LabanRandom() {
        int kq = NgauNhien(1, 4);
        if (kq == 1) return "North";
        else if (kq == 2) return "South";
        else if (kq == 3) return "East";
        else return "West";
    }


}

class GameNhanPhamTest {
    public static void main(String[] args) {
        Huong huong = new Huong();
        System.out.println(huong.LabanRandom());

    }
}

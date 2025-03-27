package GameNhanPham;
import java.util.Random;

public class Coin {
    private Random random;

    public Coin() {
        random = new Random();
    }

    public String randomDongXu() {
        /*
         * Method: randomDongXu
         * Description: Quang dong xu ngau nhien.
         *      Parameter: NULL
         *      Return: String
         */
        return random.nextBoolean() ? "Head" : "Tail";
    }
}

class Test {
    public static void main(String[] args) {
        Coin bc = new Coin();
        System.out.println(bc.randomDongXu());
    }
}

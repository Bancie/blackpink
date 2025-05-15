import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("testcase.txt"));
            String[] line1 = reader.readLine().split(" ");
            int hp1 = Integer.parseInt(line1[0]);
            int hp2 = Integer.parseInt(line1[1]);
            
            Legion romanLegion = new Legion("Quân đoàn La Mã");
            romanLegion.addWarrior(new Warrior("Marcus", hp1, 300, true));
            
            Legion mongolHorde = new Legion("Quân Mông Cổ");
            mongolHorde.addWarrior(new Warrior("Batu Khan", hp2, 350, true));
            
            Battle.fight(romanLegion, mongolHorde);
            
            PrintWriter writer = new PrintWriter("answer.txt");

            writer.println("Final HP La Mã: " + romanLegion.getTotalHP());
            writer.println("Final HP Mông Cổ: " + mongolHorde.getTotalHP());
            
            writer.close();
            reader.close();
            
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}


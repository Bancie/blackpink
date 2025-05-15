import java.util.Scanner;

public class PirateTreasureAdventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreasureHunt game = new TreasureHunt();
        
        System.out.println("Welcome to Pirate Treasure Adventure!");
        System.out.println("Reach 50 points to find the legendary treasure!");

        while (!game.isGameWon()) {
            System.out.print("Press Enter to flip the coin and spin the compass (or type 'stop' to quit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("stop")) {
                System.out.println("You stopped the adventure with " + game.getScore() + " points.");
                break;
            }

            game.playTurn();
        }

        //In thông báo kết thúc: thắng hoặc dừng)

        
        
        scanner.close();
    }
}

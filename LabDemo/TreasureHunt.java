public class TreasureHunt {
    private Coin coin;
    private Huong compass;
    private int score;
    private int steps;
    
   

    public TreasureHunt() {
        coin = new Coin();
        compass = new Huong();
        score = 0;
        steps = 0;
        consecutiveHeads = 0;
    }

    public void playTurn() {
        String coinResult = coin.flip();
        String direction = compass.spin();
        steps++;
        //Cập nhật điểm dựa trên kết quả ném xu và hướng la bàn

        // Tính điểm cơ bản: 5 điểm mỗi bước
        score += 5;

        // Kiểm tra và thưởng điểm nếu ném được Heads
        // Thưởng 10 điểm nếu được 3 Heads liên tiếp
       

        System.out.println("Step " + steps + ": Coin: " 
                + coinResult + ", Direction: " 
                    + direction + ", Score: " + score);
    }

    // Kiểm tra xem người chơi đã đạt được điểm mục tiêu hay chưa
     //Trả về điểm số hiện tại của người chơi
    public boolean isGameWon() {
        
    }

       
        
    
}

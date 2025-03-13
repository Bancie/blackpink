package Game;

class Warrior {
    String name;
    int hp;
    int gold;


    Warrior(String name, int hp, int gold) {
        this.name = name;
        this.hp = hp;
        this.gold = gold;
    }

    void displayWarrior() {
       System.out.println(name + " " + hp + " " + gold);
    }

    public static int isCommander(String commander) {
        if (commander.equals("Yes")) {
            return 1;
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Warrior nv = new Warrior("Nguyen Thi Yen", 150, 50);
        nv.displayWarrior();
        System.out.println(isCommander("Yes"));
    }
}

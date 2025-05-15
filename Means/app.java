package Means;

public abstract class app {
   public String name = "App";

   public void display() {
        System.out.println(name);
   }

    public abstract String coverName();
}

class TestApp {
    public static void main(String[] args) {
        // app a = new app();
        // display();
    }
}
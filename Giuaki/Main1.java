package Giuaki;

public class Main1 {
    public static void main(String[] args){
        Grocery gr1=new Grocery("Rice",20000,50);
        System.out.println(gr1.calculateTotalPrice());
        gr1.showDetails();
    }
}

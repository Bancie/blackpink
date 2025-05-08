package sieuthi;

public class Apparel implements Billable, Showable {

    private String brand;
    private double price;
    private String category; 
    
    public Apparel (String brand, double price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public double calculateTotalPrice() {
        return price;    
    }
    
    public void showDetails() {
        System.out.println("Product: " + this.brand + ", Price: " + this.price + ", Sold: " + this.category);
    }
    // public int getcategory();
}

class testApparel {
    public static void main(String[] args) {
    }
}
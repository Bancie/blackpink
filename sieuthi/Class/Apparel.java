package sieuthi.Class;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;

public class Apparel implements IBillable, IShowable {

    private String brand;
    private double price;
    private String category; 
    
    public Apparel (String brand, double price, String category) {
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    @Override
    public double calculateTotalPrice() {
        return price;    
    }
    
    @Override
    public void showDetails() {
        System.out.println("Product: " + this.brand + ", Price: " + this.price + ", Sold: " + this.category);
    }

    public String getBrand() {
        return this.brand;
    }
}

class testApparel {
    public static void main(String[] args) {
    }
}
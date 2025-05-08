package sieuthi;
import sieuthi.*;

public class Grocery implements Billable, Showable, Trackable {

    private String productName;
    private double pricePerUnit;
    private int unitsSold; 
    
    public Grocery (String productName, double pricePerUnit, int unitsSold) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unitsSold = unitsSold;
    }

    public double calculateTotalPrice() {
        return pricePerUnit * unitsSold;    
    }
    
    public void showDetails() {
        System.out.println("Product: " + this.productName + ", Price: " + this.pricePerUnit + ", Sold: " + this.unitsSold);
    }
    // public int getUnitsSold();
}

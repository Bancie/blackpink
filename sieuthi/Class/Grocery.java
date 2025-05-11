package sieuthi.Class;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;

public class Grocery implements IBillable, ITrackable, IShowable {

    private String productName;
    private double pricePerUnit;
    private int unitsSold; 
    
    public Grocery (String productName, double pricePerUnit, int unitsSold) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unitsSold = unitsSold;
    }

    @Override
    public double calculateTotalPrice() {
        return pricePerUnit * unitsSold;    
    }
    
    @Override
    public void showDetails() {
        System.out.println("Product: " + this.productName + ", Price: " + this.pricePerUnit);
    }
    
    @Override
    public int getUnitsSold() {
        return this.unitsSold;
    }

    public String getProductName () {
        return this.productName;
    }
}
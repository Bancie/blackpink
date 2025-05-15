package sieuthi.Class;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.IShowable;
import sieuthi.Interface.ITrackable;

public class Grocery<T1, T2, T3> implements IBillable<T1>, ITrackable<T2>, IShowable<T3> {

    private String productName;
    private double pricePerUnit;
    private int unitsSold; 
    
    public Grocery (String productName, double pricePerUnit, int unitsSold) {
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.unitsSold = unitsSold;
    }

    @Override
    public T1 calculateTotalPrice() {
        return this.pricePerUnit * this.unitsSold;    
    }
    
    @Override
    public T showDetails() {
        System.out.println("Product: " + this.productName + ", Price: " + this.pricePerUnit);
    }
    
    @Override
    public T getUnitsSold() {
        return this.unitsSold;
    }

    public String getProductName () {
        return this.productName;
    }
}
package sieuthi.Class;

import sieuthi.Interface.IBillable;
import sieuthi.Interface.ITrackable;

public class Stationery implements IBillable, ITrackable {

    private String itemName;
    private double unitPrice;
    private int itemsSold; 
    
    public Stationery (String itemName, double unitPrice, int itemsSold) {
        this.itemName = itemName;
        this.unitPrice = unitPrice;
        this.itemsSold = itemsSold;
    }

    @Override
    public double calculateTotalPrice() {
        return this.unitPrice * this.itemsSold;    
    }
    
    @Override 
    public int getUnitsSold() {
        return this.itemsSold;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void showDetails() {
        System.out.println("Stationery: " + itemName + ", Price: " + unitPrice);
    }
}

class testStationery {
    public static void main(String[] args) {
    }
}
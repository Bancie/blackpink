package sieuthi;

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
    public double calculateTotalunitPrice() {
        return this.unitPrice * this.itemsSold;    
    }
    
    @Override
    public int getUnitsSold() {
        return this.itemsSold;
    }
}

class testStationery {
    public static void main(String[] args) {
    }
}
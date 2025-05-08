package sieuthi;

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
        System.out.println("Product: " + this.productName + ", Price: " + this.pricePerUnit + ", Sold: " + this.unitsSold);
    }
    
    @Override
    public int getUnitsSold() {
        return this.unitsSold;
    }

    public double getpricePerUnit () {
        return this.pricePerUnit;
    }
}

class testGrocery {
    public static void main(String[] args) {
        Grocery g = new Grocery("Rice", 20000, 50);
        g.showDetails();
    }
}
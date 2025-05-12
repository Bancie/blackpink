package Giuaki;

public class Stationery implements Billable, Trackable {
    String itemName;
    double unitPrice;
    int itemsSold;

    public Stationery(String itemName, int unitPrice, int itemSold) {
        this.itemName=itemName;
        this.unitPrice=unitPrice;
        this.itemsSold=itemSold;
    }

    @Override
    public double calculateTotalPrice() {
        return this.unitPrice * this.itemsSold;
    }

    @Override
    public int getUnitsSold() {
return +this.itemsSold;
    }
    public void hienthi(){
        System.out.println("itemName:"+this.itemName+"\nunitPrice:"+this.unitPrice+"\nitemsSold:"+this.itemsSold);
    }

}
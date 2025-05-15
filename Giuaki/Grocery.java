package Giuaki;

public class Grocery implements Billable,Showable,Trackable{
    String productName;
    double pricePerUnit;
    int unitsSold;
    public Grocery(){}
    public Grocery(String productName,double pricePerUnit,int unitsSold){
        this.productName=productName;
        this.pricePerUnit=pricePerUnit;
        this.unitsSold=unitsSold;
    }
    @Override
    public double calculateTotalPrice() {
        return pricePerUnit*unitsSold;
    }

    @Override
    public void showDetails() {
        System.out.println("Tên sản phẩm:"+this.productName);
        System.out.println("Giá mỗi đơn vị:"+this.pricePerUnit);

    }

    @Override
    public int getUnitsSold() {
        return this.unitsSold;
    }
}

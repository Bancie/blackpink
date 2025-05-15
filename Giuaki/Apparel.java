package Giuaki;

public class Apparel implements Billable, Showable {
    String brand;
    double price;
    String category;
    public Apparel(){}
    public Apparel(String brand,double price,String category){
        this.brand=brand;
        this.price=price;
        this.category=category;
    }
    @Override
    public double calculateTotalPrice() {
        return this.price;
    }

    @Override
    public void showDetails() {
        System.out.println("Tên thương hiệu:"+this.brand);
        System.out.println("Tên danh mục:"+this.category);
    }
}

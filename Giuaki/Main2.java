package Giuaki;

public class Main2 {
    public static void main(String[] args){
        Billable gr1=new Grocery("Rice",20000,50);
        Billable ap1=new Apparel("Honda",10000,"Xe");
        Billable st1=new Stationery("Sách",30000,10);
        DanhSach ds=new DanhSach();
        ds.addlist(gr1);
        ds.addlist(ap1);
        ds.addlist(st1);
        ds.tong();
    }
}

package Giuaki;

public class Main6 {
    public static void main(String[] args){
        Billable gr1=new Grocery("Rice",20000,110);
        Billable ap1=new Apparel("Motor",1200000,"Phân khối lớn");
        Billable st1=new Stationery("Sách",20000,150);
        DanhSach ds=new DanhSach();
        ds.addlist(gr1);
        ds.addlist(ap1);
        ds.addlist(st1);
        ds.cau6();
    }
}

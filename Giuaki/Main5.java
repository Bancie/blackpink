package Giuaki;

public class Main5 {
    public static void main(String[] args){
        Billable gr1=new Grocery("Rice",20000,110);
        Billable ap1=new Apparel("Motor",1200000,"Phân khối lớn");
        DanhSach ds=new DanhSach();
        ds.addlist(gr1);
        ds.addlist(ap1);
        ds.addShowable();
    }
}

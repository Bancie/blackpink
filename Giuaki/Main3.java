package Giuaki;

public class Main3 {
    public static void main(String[] args){
        Billable gr1=new Grocery("Rice",20000,110);
        Billable st1=new Stationery("Sách",20000,150);
        Billable st2=new Stationery("Viết",500000,10);
        DanhSach ds=new DanhSach();
        ds.addlist(gr1);
        ds.addlist(st1);
        ds.addTrackable();
    }
}

package Giuaki;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSach {
    ArrayList<Billable> list=new ArrayList<>();
    ArrayList<Trackable> list1=new ArrayList<>();
    ArrayList<Showable> list2=new ArrayList<>();
    public void addlist(Billable x){
        list.add(x);
    }
    public void tong() {
        int sum = 0;
        for (Billable x : list) {
            sum += x.calculateTotalPrice();
        }
        System.out.println("Tổng tiền:" + sum);
    }
    public void addTrackable(){
        for(Billable x:list){
            if(x instanceof Trackable){
                list1.add((Trackable) x);
            }
        }
        for(Trackable x:list1){
            if(x.getUnitsSold()>=100 && x instanceof Grocery){
                Showable a=(Showable) x;
               a.showDetails();
            }
            else
            {
                Stationery a=(Stationery) x;
                a.hienthi();
            }
        }
    }
    public void addShowable(){
        for(Billable x:list){
            if(x instanceof Showable){
                list2.add((Showable) x);
            }
        }
        for(Showable x:list2){
            if(x instanceof Apparel ){
                x.showDetails();
                System.out.print("This is an apparel item.");
            }
            else
            {
                x.showDetails();
            }
        }
    }
//cau6
    public void cau6(){
        int n=500000;
        for(Billable x:list){
          if(x.calculateTotalPrice()>n && !(x instanceof Stationery) ){
              Showable a=(Showable) x;
              a.showDetails();
          }
          else if(x instanceof Stationery && x.calculateTotalPrice()>n){
              ((Stationery) x).hienthi();
          }
        }
    }
//cau4
    public void soluongbancaonhat(){
        int max=0;
        int dem=0;
        for(Billable x:list){
            if(x instanceof Trackable){
                list1.add((Trackable) x);
            }
        }
        for(Trackable a:list1){
            if(a.getUnitsSold()>max){
                max=a.getUnitsSold();
            }
            dem++;
        }
        if(list1.isEmpty()){
            throw new IllegalStateException("Danh sách sản phẩm rỗng");
        }
        for(Trackable a:list1){
            if(a.getUnitsSold()==max && a instanceof Grocery){
                Showable x=(Showable) a;
               x.showDetails();
            }
            else if(a.getUnitsSold()==max && a instanceof Stationery)
            {
                ((Stationery) a).hienthi();
            }
        }

    }
}

package java_tuan11;

import java.util.ArrayList;

public class Project {
    String projectName;
    ArrayList<Employee> list=new ArrayList<>();
    public void addnv(Employee x){
        list.add(x);
    }
    public void thongtin(){
        for(Employee x:list){
           System.out.println(x);
        }
    }
    public int demManager(){
        int dem=0;
        for(Employee x:list){
            if( x instanceof Manager){
                dem++;
            }
        }
        return dem;
    }
    public double tuoitrungbinh(){
        int n=0;
        double sum=0;
        for(Employee x:list){
            n++;
            sum+=2025-x.birthYear;
        }
        return (double)sum/n;
    }
    public void timqulcaonhat(){
    int min=2025;
        for(Employee x:list){
            if(x.birthYear<min && x instanceof Manager){
                min=x.birthYear;
            }
        }
        for(Employee x:list){
                if(x.birthYear==min && x instanceof Manager  ){
                    Manager a=(Manager) x;
                    int b=2025-a.birthYear;
                    System.out.println(a.name+" "+a.department+" "+b);
                }
            }
        }
}
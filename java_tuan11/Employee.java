package java_tuan11;

public  abstract class Employee {
   public String name;
    int id;
    int birthYear;

    public Employee(String name,int id,int birthYear){
        this.name=name;
        this.id=id;
        this.birthYear=birthYear;
    }

    public abstract String getRole();

    public String toString(){
        return "Họ và tên:"+name+" Mã:"+id+" Vai trò:"+getRole();
    }
}

package java_tuan11;

public class Manager extends Employee {
    public String department;
    public Manager(String name,int id,int birthYear,String department){
        super(name,id,birthYear);
        this.department=department;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

}

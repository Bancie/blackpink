package ktgki.Class;
import java.util.List;
import java.util.ArrayList;
import ktgki.Interface.IDisplayable;
import ktgki.Interface.IPayable;
import ktgki.Class.Employee;

class ds {
    private String projectName;
    private List<Employee> ds = new ArrayList<>();

    public void addMember (Employee e) {
        ds.add(e);
    }

    public double totalCost() {
        double sum = 0;
        for (Employee i : ds) {
            sum += i.calculateSalary();
        }
        return sum;
    }

    public void getMembersWithExp(int years) {
        for (Employee i : ds) {
            if (i.getexprerienceYear() > years) {
                i.displayInfo();
            }
        }
    }
}

public class cau1 {
    public static void main(String[] args) {
        ds d = new ds();
        Employee e1 = new Employee("Nam", 8000000, 3);
        System.out.println(e1.calculateSalary());
        e1.displayInfo();
    }
}

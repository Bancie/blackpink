package ktgki.Class;
import ktgki.Interface.IDisplayable;
import ktgki.Interface.IPayable;

public class Employee implements IDisplayable, IPayable {
    private String name;
    private double baseSalary;
    private int exprerienceYear;

public Employee (String name, double baseSalary, int exprerienceYear) {
    this.name = name;
    this.baseSalary = baseSalary;
    this.exprerienceYear = exprerienceYear;
}

    @Override
    public void displayInfo() {
        System.out.println("Ten: " + this.name + " Nam kinh nghiem: " + this.exprerienceYear);
    }

    @Override
    public double calculateSalary() {
        return (this.baseSalary + this.exprerienceYear) * 1000000;
    }

    public int getexprerienceYear () {
        return this.exprerienceYear;
    }
}

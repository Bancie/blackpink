package qlnvda;
import java.util.ArrayList;
import java.util.List;

interface Employee {
    String getName();
    String getId();
    int getBirthYear();
    String getRole();

    default void printInfo() {
        System.out.println("Name: " + getName() + ", ID: " + getId() + ", Role: " + getRole());
    }
}

class Manager implements Employee {
    private String name;
    private String id;
    private int birthYear;
    private String department;

    public Manager(String name, String id, int birthYear, String department) {
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public String getRole() {
        return "Manager of " + department;
    }
}

class Staff implements Employee {
    private String name;
    private String id;
    private int birthYear;

    public Staff(String name, String id, int birthYear) {
        this.name = name;
        this.id = id;
        this.birthYear = birthYear;
    }

    @Override
    public String getName() { return name; }

    @Override
    public String getId() { return id; }

    @Override
    public int getBirthYear() { return birthYear; }

    @Override
    public String getRole() {
        return "Staff";
    }
}

class Project {
    private String projectName;
    private List<Employee> team;

    public Project(String projectName) {
        this.projectName = projectName;
        this.team = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public void showTeam() {
        System.out.println("Project: " + projectName);
        for (Employee e : team) {
            e.printInfo();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Project p = new Project("AI Research");

        Employee m = new Manager("Bao du", "3122480003", 2004, "PETER");
        Employee s1 = new Staff("Khoi louisaga", "3122480045", 2003);

        p.addEmployee(m);
        p.addEmployee(s1);

        p.showTeam();
    }
}
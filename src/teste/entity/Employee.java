package teste.entity;

public class Employee {

    private String name;
    private double grossSalary;

    public Employee(String name, double grossSalary) {
        this.name = name;
        this.grossSalary = grossSalary;
    }

    public String getName() {
        return name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", grossSalary=" + grossSalary +
                '}';
    }
}

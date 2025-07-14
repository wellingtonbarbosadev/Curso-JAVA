package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        double percent_tax = percentage / 100;
        grossSalary += grossSalary * percent_tax;

        System.out.printf("Updated data: %s, $%.2f", name, netSalary());
    }
}

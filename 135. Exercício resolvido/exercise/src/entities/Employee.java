package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHour;

    public static List<Employee> employees = new ArrayList<>();

    public Employee() {
    }

    public Employee(Integer hours, String name, Double valuePerHour) {
        this.hours = hours;
        this.name = name;
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Double payment() {
        return getValuePerHour() * getHours();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" - $ ");
        sb.append(String.format("%.2f", payment()));
        return sb.toString();
    }
}

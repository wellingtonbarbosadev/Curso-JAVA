package entities;

import java.util.ArrayList;
import java.util.List;

public class Employeers {
    public static List<Employeers> list = new ArrayList<>();
    private int id;
    static Employeers emp;
    private String name;
    private double salary;

    public Employeers() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void criarFuncionario(int id, String name, double salary) {
        Employeers emp = new Employeers();
        emp.setId(id);
        emp.setName(name);
        emp.setSalary(salary);
        list.add(emp);
    }
    public static void listarFuncionarios() {
        for (Employeers emp : list) {
            System.out.printf("%d, %s, $%.2f", emp.getId(),emp.getName(), emp.getSalary());
            System.out.println();
        }

    }

    public static void aumentarSalario(int id, double percent){
        for (Employeers emp : list) {
            if (emp.getId() == id) {

                percent = percent / 100.0;
                emp.setSalary(emp.getSalary() + (percent * emp.getSalary()));
            }
        }

    }

    public static Boolean hasId(int id) {
        for (Employeers emp : list) {
            if (emp.getId() == id) {
                return true;
            }
        }
        return false;
    }
}

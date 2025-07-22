package application;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        line();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:", i);
            System.out.println();
            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            Employee emp;
            if (outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                emp = new OutsourcedEmployee(hours, name, valuePerHour, additionalCharge);
            }
            else {
                emp = new Employee(hours, name, valuePerHour);
            }
            Employee.employees.add(emp);
            line();
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee e : Employee.employees) {
            System.out.println(e);
        }
    }

    public static void line() {
        for (int i = 1; i <= 20; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}

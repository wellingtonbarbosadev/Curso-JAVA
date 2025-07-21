package application;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        Department department = new Department(departmentName);

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Level: ");
        String level = sc.next();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(baseSalary, new Department(departmentName), WorkerLevel.valueOf(level), name);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter contract #" + (i+1) + " data");
            System.out.print("Date (DD/MM/YYYY): ");

            String date = sc.next();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate data = LocalDate.parse(date, formatter);

            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();
            HourContract contract = new HourContract(data, duration, valuePerHour);
            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String mmYYYY = sc.next();
        String[] d_ = mmYYYY.split("/");
        int d_month = Integer.parseInt(d_[0]);
        int d_year = Integer.parseInt(d_[1]);
        System.out.print("Name: ");
        System.out.println(worker.getName());
        System.out.print("Department: ");
        System.out.println(worker.getDepartment().getName());
        System.out.println("Income for " + mmYYYY + ": " + String.format("%.2f" ,worker.income(d_year, d_month)));
    }
}

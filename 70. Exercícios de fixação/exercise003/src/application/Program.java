package application;

import entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Students student = new Students();

        System.out.print("A1 result: ");
        student.a1 = sc.nextDouble();
        System.out.print("A2 result: ");
        student.a2 = sc.nextDouble();
        System.out.print("A3 result: ");
        student.a3 = sc.nextDouble();
        System.out.println();

        student.checkPass();

        sc.close();
    }
}

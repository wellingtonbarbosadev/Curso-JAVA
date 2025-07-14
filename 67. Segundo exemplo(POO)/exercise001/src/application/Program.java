package application;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter rectangle width and height: ");

        Rectangle rectangle = new Rectangle();

        System.out.print("Width: ");
        rectangle.width = sc.nextDouble();
        System.out.print("Height: ");
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.printf("Area: %.2f", rectangle.calculateArea());
        System.out.println();
        System.out.printf("Perimeter: %.2f", rectangle.calculatePerimeter());
        System.out.println();
        System.out.printf("Diagonal: %.2f", rectangle.calculateDiagonal());

        sc.close();
    }
}

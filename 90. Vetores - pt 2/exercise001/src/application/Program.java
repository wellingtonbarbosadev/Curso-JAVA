package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos produtos você quer adicionar? ");
        int n = sc.nextInt();

        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Produto: ");
            String name = sc.nextLine();
            System.out.print("Preço: ");
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
            System.out.println();
        }
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.printf("Average Price = $%.2f", avg);

        sc.close();
    }
}

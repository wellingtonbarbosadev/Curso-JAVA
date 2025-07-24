package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Product #%d data:", i);
            System.out.println();
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();

            Product p;
            if (type == 'c') {
                p = new Product(name, price);
                products.add(p);
                continue;
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                DateTimeFormatter dtm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate dateFormatted = LocalDate.parse(date, dtm);
                dateFormatted.format(dtm);
                System.out.println(dateFormatted.format(dtm));
                p = new UsedProduct(name, price, dateFormatted);
                products.add(p);
            } else if (type == 'i') {
                System.out.print("Custom fee: ");
                double customFee = sc.nextDouble();
                p = new ImportedProduct(name, price, customFee);
                products.add(p);
            }
        }

        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
    }
}

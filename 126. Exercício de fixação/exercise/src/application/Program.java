package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(birthDate, formatter);
        String dateBirth = localDate.format(formatter);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();

        LocalDateTime moment = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dateFormatted = moment.format(formatter2);
        Client client = new Client(dateBirth, email, name);
        Order order = new Order(client, dateFormatted, status);
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            sc.nextLine();9
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();
            Product product = new Product(productPrice, productName);
            OrderItem orderItem = new OrderItem(quantity, product, productPrice);

            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: ");
        System.out.println(order.getMoment());
        System.out.print("Order status: ");
        System.out.println(order.getStatus());

        System.out.printf("Client: %s (%s) - %s%n", order.getClient().getName(), order.getClient().getBirthDate(), order.getClient().getEmail());

        System.out.println("Order items:");

        double sum = 0.0;
        for (OrderItem p : order.getItems()) {
            double subTotal = p.getProduct().getPrice() * p.getQuantity();
            System.out.printf("%s, $%.2f, Quantity: %d, Subtotal: $%.2f\n", p.getProduct().getName(), p.getProduct().getPrice(), p.getQuantity(), subTotal);
            sum += subTotal;
        }
        System.out.println("Total price: $" + String.format("%.2f", sum));

        sc.close();
    }
}

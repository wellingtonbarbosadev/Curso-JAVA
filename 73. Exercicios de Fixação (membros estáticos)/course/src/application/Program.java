package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("What is the dollar price? ");
        double dollar_price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double dollars_bought = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.paid_price(dollar_price, dollars_bought));
    }
}

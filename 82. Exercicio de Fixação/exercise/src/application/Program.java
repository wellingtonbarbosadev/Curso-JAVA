package application;

import entities.Holders;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter account number: ");
        int account_number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String account_holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char initial_deposit = sc.next().charAt(0);
        Holders holder;

        if (initial_deposit == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initial_deposit_value = sc.nextDouble();
            holder = new Holders(account_number, account_holder, initial_deposit_value);
        }
        else {
            holder = new Holders(account_number, account_holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(holder);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        holder.setDeposit(sc.nextDouble());

        System.out.print("Enter a withdraw value: ");
        holder.setWithdraw(sc.nextDouble());

        sc.close();
    }
}

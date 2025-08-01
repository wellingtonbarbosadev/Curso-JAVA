package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Números negativos:");
        for (int i = 0; i < vect.length; i++) {
            if ( vect[i] < 0 ) {
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}

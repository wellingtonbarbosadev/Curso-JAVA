package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos números você quer verificar? ");
        int n = sc.nextInt();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            num[i] = sc.nextInt();
        }
        int pares = 0;
        for (int i = 0; i < n; i++) {
            if (num[i] % 2 == 0) {
                System.out.printf("Número %d é par", num[i]);
                System.out.println();
                pares += 1;
            }
        }
        if (pares == 1) {
            System.out.println(pares + " número digitado é par.");
        }
        else {
            System.out.println(pares + " números digitados são pares.");
        }
        sc.close();
    }
}

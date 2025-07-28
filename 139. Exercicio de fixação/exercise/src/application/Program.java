package application;

import entities.Contas;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Contas> contasList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.printf("Tax payer #%d data:\n", i);
            System.out.print("Individual or company (i/c)? ");
            char typeAcc = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String nome = sc.next();
            System.out.print("Anual income: ");
            Double rendaAnual = sc.nextDouble();
            if (typeAcc == 'i') {
                System.out.print("Health expenditures: ");
                Double gastosComSaude = sc.nextDouble();
                contasList.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
            } else if (typeAcc == 'c') {
                System.out.print("Number of employeers: ");
                Integer numeroDeFuncionarios = sc.nextInt();
                contasList.add(new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double sum = 0.0;
        for (Contas conta : contasList) {
            System.out.println(conta);
            sum += conta.total();
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f", sum);
        System.out.println();
    }
}

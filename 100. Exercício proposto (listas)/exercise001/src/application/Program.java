package application;

import entities.Employeers;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos funcionários vão ser registrados? ");
        int qtdFuncionarios = sc.nextInt();
        int employeeId = 0;
        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.println();
            System.out.printf("Funcionário #%d:\n", i+1);
            while (true) {

                System.out.print("ID: ");
                employeeId = sc.nextInt();
                sc.nextLine();
                if (Employeers.hasId(employeeId)) {
                    System.out.println("Este id já existe.");
                }
                else {
                    break;
                }
            }

            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            Employeers.criarFuncionario(employeeId, nome, salario);

        }
        System.out.println();
        System.out.print("Digite o ID de quem vai ter o aumento de salário: ");
        employeeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Em quantos %? ");
        double percent = sc.nextDouble();
        Employeers.aumentarSalario(employeeId, percent);
        System.out.println();
        System.out.println("Lista de funcionários: ");
        Employeers.listarFuncionarios();
    }
}

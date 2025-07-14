package application;

import entities.Pessoa;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pessoa p1 = new Pessoa();
        System.out.println("Digite os dados da primeira pessoa: ");
        System.out.print("Nome: ");
        p1.nome = sc.nextLine();
        System.out.print("Idade: ");
        p1.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        p1.email = sc.next();

        Pessoa p2 = new Pessoa();
        System.out.println("Digite os dados da segunda pessoa: ");
        System.out.print("Nome: ");
        sc.nextLine();
        p2.nome = sc.nextLine();
        System.out.print("Idade: ");
        p2.idade = sc.nextInt();
        sc.nextLine();
        System.out.print("Email: ");
        p2.email = sc.next();

        System.out.println("Dados cadastrados:");
        System.out.printf("Pessoa 1: %s\n", p1);
        System.out.printf("Pessoa 2: %s\n", p2);

        sc.close();
    }
}

package application;

import util.ToDoList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);


        while (true) {
            System.out.println();
            System.out.println("1. Ver lista");
            System.out.println("2. Adicionar algo na lista");
            System.out.println("3. Remover algo na lista");
            System.out.println("9. Fechar");
            System.out.println();
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (option == 1) {
                util.ToDoList.verLista();
                sc.nextLine();
            }
            else if (option == 2) {
                System.out.print("O que você quer adicionar? ");
                util.ToDoList.adicionarNaLista(sc.nextLine());
                sc.nextLine();
            }
            else if (option == 3) {
                util.ToDoList.verLista();
                System.out.print("O que você quer remover? (nome ou posição) ");
                util.ToDoList.removerDaLista(sc.next());
                sc.nextLine();

            }

            if (option == 9) {
                break;
            }

        }

        sc.close();
    }
}

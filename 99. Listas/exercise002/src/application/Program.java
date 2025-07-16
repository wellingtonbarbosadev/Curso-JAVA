package application;

import util.ItemDeCompra;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        while (true) {
            System.out.println();
            System.out.println("1. Ver lista");
            System.out.println("2. Adicionar item na lista");
            System.out.println("3. Remover item na lista");
            System.out.println("4. Marcar item comprado");
            System.out.println("9. Fechar");
            System.out.println();
            int option = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if (option == 1) {
                ItemDeCompra.verLista();
                sc.nextLine();
            } else if (option == 2) {
                System.out.print("Nome do item: ");
                String nomeItem = sc.nextLine();
                System.out.print("Quantidade: ");
                int qtdItem = sc.nextInt();
                ItemDeCompra.adicionarNaLista(nomeItem, qtdItem);
                sc.nextLine();
                sc.nextLine();
            } else if (option == 3) {
                ItemDeCompra.verLista();
                System.out.print("Qual item você deseja remover? ");
                String itemRemover = sc.nextLine();
                ItemDeCompra.removerDaLista(itemRemover);
            } else if (option == 4) {
                ItemDeCompra.verLista();
                System.out.print("Qual item foi comprado? ");
                String itemComprado = sc.nextLine();
                ItemDeCompra.marcarComoComprado(itemComprado);
                sc.nextLine();

            }
        }
    }
}

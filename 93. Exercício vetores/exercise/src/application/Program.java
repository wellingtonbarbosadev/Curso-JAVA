package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantas pessoas serão registradas? ");
        int n = sc.nextInt();
        Pessoas[] pessoa = new Pessoas[n];

        for (int i = 0; i < pessoa.length; i++) {
            sc.nextLine();
            pessoa[i] = new Pessoas();

            System.out.printf("Dados da %da pessoa:\n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            pessoa[i].setName(nome);

            System.out.print("Idade: ");
            int idade = sc.nextInt();
            pessoa[i].setIdade(idade);

            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            pessoa[i].setAltura(altura);

            System.out.println();

        }

        double alturaMedia = 0;
        for (int i = 0; i < pessoa.length; i++) {
            alturaMedia += pessoa[i].getAltura();
        }

        System.out.printf("Altura média: %.2f\n", alturaMedia / n);

        int pessoasMenos16 = 0;
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                pessoasMenos16 += 1;
            }
        }

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", ((double) pessoasMenos16 / pessoa.length) * 100);

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getIdade() < 16) {
                System.out.println(pessoa[i].getName());
            }
        }

        sc.close();
    }
}

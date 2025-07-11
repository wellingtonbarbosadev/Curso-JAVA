import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        double nota;

        System.out.print("Digite seu nome, idade e nota, no seguinte formato: nome(string) idade(int) nota(double): ");
        nome = sc.next();
        idade = sc.nextInt();
        nota = sc.nextDouble();

        System.out.printf("Nome: %s \nIdade: %d \nNota: %.1f", nome, idade, nota);
    }
}

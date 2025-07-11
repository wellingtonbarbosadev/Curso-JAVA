import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String _string;
        System.out.print("Digite um String: ");
        _string = sc.next();
        System.out.println("Dados: " + _string);
        System.out.println();

        int _inteiro;
        System.out.print("Digite um Inteiro: ");
        _inteiro = sc.nextInt();
        System.out.println("Dados: " + _inteiro);
        System.out.println();

        double _double;
        System.out.print("Digite um double no padrão do computador: ");
        _double = sc.nextDouble();
        System.out.println("Dados: " + _double);
        System.out.println();

        char _chat;
        System.out.print("Digite um Char: ");
        _chat = sc.next().charAt(0);
        System.out.println("Dados: " + _chat);
        System.out.println();


        sc.close();
    }
}

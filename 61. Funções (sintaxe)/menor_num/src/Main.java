import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 4 números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int min = minNumber(a, b, c, d);
        showResult(min);
        sc.close();
    }

    public static int minNumber(int a, int b, int c, int d) {
        int menor = a;
        if (b < menor) {
            menor = b;
        }
        if (c < menor) {
            menor = c;
        }
        if (d < menor) {
            menor = d;
        }
        return menor;
    }

    public static void showResult(int min) {
        System.out.printf("Menor número: %d\n", min);
    }

}


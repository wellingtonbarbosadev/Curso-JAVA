import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tabuada do número: ");
        int num = sc.nextInt();

        for (int i=1; i<=10; i++) {
            double resultado = num * i;
            System.out.printf("%dx%d = %.0f\n", num, i, resultado);

        }
        sc.close();
    }
}
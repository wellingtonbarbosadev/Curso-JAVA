import java.util.Scanner;

public class CheckPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correct_password = "java2025";
        String password;

        do {
            System.out.print("Digite sua senha: ");
            password = sc.next();
            if (!password.equals(correct_password)) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (!password.equals(correct_password));

        System.out.println("Senha correta!");
        sc.close();

    }
}

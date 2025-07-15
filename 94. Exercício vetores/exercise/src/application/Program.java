package application;

import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        Rooms[] room = new Rooms[20];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.printf("Quarto #%d:\n", i+1);
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int room_number = sc.nextInt();
            room[room_number] = new Rooms(name, email, room_number);
            System.out.println();
        }

        System.out.println("Quartos ocupados:");
        for (int i = 0; i <= 19; i++) {
            if (room[i] != null) {
                System.out.printf("%d: %s, %s", room[i].getRoom(), room[i].getName(), room[i].getEmail());
                System.out.println();
            }
        }


    }
}

package application;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantas linhas? ");
        int l = sc.nextInt();
        System.out.print("Quantas colunas? ");
        int c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        sc.nextLine();
        System.out.println("Qual número deseja verificar as posições? ");
        int n = sc.nextInt();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == n) {
                    System.out.printf("Position %d,%d", i, j);
                    System.out.println();
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][(j+1)]);
                    }

                    if (j > 0) {
                        System.out.println("Left: " + mat[i][(j-1)]);
                    }

                    if (i > 0) {
                        System.out.println("Up: " + mat[(i-1)][j]);
                    }

                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[(i+1)][j]);
                    }
                    System.out.println();
                }
            }
        }
    }
}

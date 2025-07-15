package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> list = new ArrayList<>();

    public static void adicionarNaLista(String string) {
        list.add(string);
        System.out.printf("""
                "%s" adicionado na lista.""", string);
        System.out.println();
    }

    public static void verLista() {
        if (list.isEmpty()) {
            System.out.println("Lista esta vazia.");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%d. %s", i+1, list.get(i));
            System.out.println();
        }

    }

    public static void removerDaLista(String string) {
        try {
            if (Integer.parseInt(string) >= 0) {
                int string2 = Integer.parseInt(string);
                string = list.get(string2 - 1);
                list.remove(string2 - 1);

            }
        } catch (NumberFormatException e) {
            list.remove(string);
        }


        System.out.printf("""
                "%s" removido da lista.""", string);
        System.out.println();
    }
}

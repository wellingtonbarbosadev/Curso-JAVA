package util;

import java.util.ArrayList;
import java.util.List;

public class ItemDeCompra {

    public static List<ItemDeCompra> list = new ArrayList<>();
    private String nome;
    private int quantidade;
    private boolean comprado;


    public boolean isComprado() {
        return comprado;
    }

    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void verLista() {
        if (list.isEmpty()) {
            System.out.println("Lista vazia.");
        } else {
            for (int i = 0; i < list.size(); i++) {
                ItemDeCompra item = list.get(i); // AQUI pegamos o objeto da lista!
                System.out.printf("%d. %s, %d unidade(s), %s%n",
                        i + 1,
                        item.getNome(),
                        item.getQuantidade(),
                        item.isComprado() ? "✅" : "❌");
            }
        }
    }

    public static void adicionarNaLista(String nomeItem, int qtdItem) {
        ItemDeCompra item = new ItemDeCompra();
        item.setNome(nomeItem);
        item.setQuantidade(qtdItem);
        list.add(item);
        System.out.printf("%d quantidade(s) de %s adicionado na lista", qtdItem, nomeItem);
    }

    public static void removerDaLista(String itemRemover) {
        boolean foiRemovido = false;
        try {
            int itemParaRemover = Integer.parseInt(itemRemover);
            if (itemParaRemover > 0 && itemParaRemover <= list.size()) {
                itemRemover = list.get(itemParaRemover - 1).getNome();
                list.remove(itemParaRemover - 1);
                foiRemovido = true;
            }


        } catch (Exception e) {
            String finalItemRemover = itemRemover;
            foiRemovido = list.removeIf(item -> item.getNome().equalsIgnoreCase(finalItemRemover));

        }
        if (foiRemovido) {
            System.out.printf("\"%s\" removido da lista.%n", itemRemover);
        } else {
            System.out.printf("\"%s\" não encontrado na lista.%n", itemRemover);
        }
    }

    public static void marcarComoComprado(String itemComprado) {
        try {
            int itemCompradoINT = Integer.parseInt(itemComprado);
            list.get(itemCompradoINT -1).setComprado(true);

        } catch (Exception _) {
            for (ItemDeCompra item : list) {
                if (item.getNome().equalsIgnoreCase(itemComprado)) {
                    item.setComprado(true);
                    break;
                }
            }

        }
        verLista();
    }


}

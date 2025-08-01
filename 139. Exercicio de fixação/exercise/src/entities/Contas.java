package entities;

public abstract class Contas {
    private String nome;
    private Double rendaAnual;

    public Contas() {
    }

    public Contas(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract Double total();

    public String toString() {
        return getNome() + ": $ " + String.format("%.2f", total());
    }
}

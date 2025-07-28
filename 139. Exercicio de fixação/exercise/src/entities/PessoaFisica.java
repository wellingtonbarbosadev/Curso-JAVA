package entities;

public class PessoaFisica extends Contas {
    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        super(nome, rendaAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public Double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(Double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double total() {
        double imposto;

        if (getRendaAnual() > 20000.0) {
            imposto = (getRendaAnual() * 0.25) - (getGastosComSaude() * 0.5);
        }
        else {
            imposto = (getRendaAnual() * 0.15) - (getGastosComSaude() * 0.5);
        }

        return imposto;
    }
}

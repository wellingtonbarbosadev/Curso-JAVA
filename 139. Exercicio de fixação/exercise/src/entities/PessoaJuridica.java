package entities;

public class PessoaJuridica extends Contas {
    private Integer numeroDeFuncionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public Double total() {
        Double imposto;

        if (getNumeroDeFuncionarios() > 10) {
            imposto = getRendaAnual() * 0.14;
        }
        else {
            imposto = getRendaAnual() * 0.16;
        }

        return imposto;
    }
}

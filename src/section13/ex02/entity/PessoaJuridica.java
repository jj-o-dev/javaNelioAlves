package section13.ex02.entity;

public class PessoaJuridica extends Pessoa{
    private int numFuncionarios;

    public PessoaJuridica(String nome, double rendaAnual, int numFuncionarios) {
        super(nome, rendaAnual);
        this.numFuncionarios = numFuncionarios;
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public void setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public double taxa() {
        double percent = (numFuncionarios > 10) ? 0.14: 0.16;
        return getRendaAnual() * percent;
    }


}

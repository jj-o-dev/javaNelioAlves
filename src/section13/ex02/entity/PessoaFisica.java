package section13.ex02.entity;

public class PessoaFisica extends Pessoa{
    private double gastoSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;
    }

    public double getGastoSaude() {
        return gastoSaude;
    }

    public void setGastoSaude(double gastoSaude) {
        this.gastoSaude = gastoSaude;
    }

    @Override
    public double taxa() {
        double percent = (getRendaAnual() < 20.000) ? 0.15: 0.25;

        if (getGastoSaude() > 0) {
            return getRendaAnual() * percent - getGastoSaude() * 0.50;
        }
        return getRendaAnual() * percent;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

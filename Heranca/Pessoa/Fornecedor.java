package Heranca.Pessoa;

public class Fornecedor extends Pessoa{
    // crédito máximo atribuído ao fornecedor
    private double valorCredito;

    // montante da dívida para com o fornecedor
    private double valorDivida;

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}

package Heranca.Pessoa;

public class Operario extends Empregado{
    private double valorProducao;
    private double comissao;

    public Operario(int codigoSetor, double salarioBase, double imposto) {
        super(codigoSetor, salarioBase, imposto);
    }

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    }

    public Operario(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome, codigoSetor, salarioBase, imposto);
    }

    public double calcularComissao(double valorProducao, double comissao) {
        // supomos que a comissao seja 5% do valorProducao
        comissao = valorProducao * 0.05;
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + comissao;
    }
}

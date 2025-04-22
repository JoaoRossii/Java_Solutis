package Heranca.Pessoa;

public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public Administrador(int codigoSetor, double salarioBase, double imposto) {
        super(codigoSetor, salarioBase, imposto);
    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
    }

    public Administrador(String nome, int codigoSetor, double salarioBase, double imposto) {
        super(nome, codigoSetor, salarioBase, imposto);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }
}

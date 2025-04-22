package Heranca.Pessoa;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome("Carlos da Silva");
        fornecedor.setEndereco("Rua das Acácias, 123");
        fornecedor.setTelefone("(11) 99999-1234");

        fornecedor.setValorCredito(5000.00);
        fornecedor.setValorDivida(1500.00);

        System.out.println("Dados do Fornecedor:");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Valor de Crédito: R$ " + fornecedor.getValorCredito());
        System.out.println("Valor da Dívida: R$ " + fornecedor.getValorDivida());
        System.out.println("Saldo disponível: R$ " + fornecedor.obterSaldo());
    }
}

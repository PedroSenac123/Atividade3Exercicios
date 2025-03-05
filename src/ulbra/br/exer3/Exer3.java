package ulbra.br.exer3;

public class Exer3 {

    private String nome;
    private int quantidade;
    private double preco;

    public Exer3() {
    }

    public Exer3(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
            return true;
        } else {
            System.out.println("Estoque insuficiente!");
            return false;
        }
    }

    public void exibirInformacoes() {
        System.out.println("Produto:" + nome);
        System.out.println("Quantidade:" + quantidade);
        System.out.println("Preço:" + preco);
    }

    public double valorTotalEstoque() {
        return quantidade * preco;
    }

}

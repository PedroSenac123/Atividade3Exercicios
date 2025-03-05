
package ulbra.br.exer3;


public class TesterExer3 {
    public static void main(String[] args) {
        Exer3 produto =  new Exer3();
        produto.setNome("PC gamer");
        produto.setPreco(6000.0);
        produto.setQuantidade(10);

        produto.exibirInformacoes();
        System.out.println("Valor total do estoque: R$" + produto.valorTotalEstoque());

        System.out.println("Adicionando 5 unidades ao estoque...");
        produto.adicionarEstoque(5);
        produto.exibirInformacoes();

        System.out.println("Removendo 12 unidades do estoque...");
        produto.removerEstoque(12);
        produto.exibirInformacoes();

        System.out.println("Valor total do estoque: R$" + produto.valorTotalEstoque());
    
    }
}

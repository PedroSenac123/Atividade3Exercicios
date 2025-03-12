
package ulbra.br.exer9;

import java.util.Scanner;


public class TestarExer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exer9 livro = new Exer9();

        System.out.print("Digite o título do livro: ");
        livro.setTitulo(scanner.nextLine());

        System.out.print("Digite o autor do livro: ");
        livro.setAutor(scanner.nextLine());

        System.out.print("Digite o total de páginas do livro: ");
        livro.setTotalPaginas(scanner.nextInt());

        System.out.print("Digite o número de páginas lidas: ");
        livro.setPaginasLidas(scanner.nextInt());

        System.out.println("\nInformações do livro:");
        livro.exibirInformacoes();

        scanner.close();
    }
}

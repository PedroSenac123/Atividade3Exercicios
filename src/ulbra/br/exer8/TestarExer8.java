
package ulbra.br.exer8;

import java.util.Scanner;


public class TestarExer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exer8 funcionario = new Exer8();

        System.out.print("Digite o nome do funcionário: ");
        funcionario.setNome(scanner.nextLine());

        System.out.print("Digite o salário do funcionário: ");
        funcionario.setSalario(scanner.nextDouble());

        System.out.print("Digite o percentual de reajuste: ");
        double percentual = scanner.nextDouble();
        funcionario.reajustarSalario(percentual);

        System.out.println("\nInformações do funcionário após reajuste:");
        funcionario.exibirInformacoes();

        scanner.close();
    }
}

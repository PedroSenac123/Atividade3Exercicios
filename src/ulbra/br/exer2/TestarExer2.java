
package ulbra.br.exer2;


public class TestarExer2 {
    public static void main(String[] args) {
        Exer2 pessoa = new Exer2();
        pessoa.setNome("Carlos");
        pessoa.setIdade(25);
        pessoa.setAltura(1.75);

        pessoa.exibirDados();

        if (pessoa.maiorDeIdade()) {
            System.out.println("A pessoa é maior de idade.");
        } else {
            System.out.println("A pessoa é menor de idade.");
        }

        System.out.println("Anos para atingir 100 anos: " + pessoa.anosParaCem());
    }
}

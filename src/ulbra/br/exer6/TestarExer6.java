
package ulbra.br.exer6;

import java.util.Scanner;


public class TestarExer6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Exer6 aluno = new Exer6();
        
        System.out.println("Digite o nome do aluno:");
        aluno.setNome(ler.nextLine());
        
        System.out.println("Digite a primeira nota do aluno:");
        aluno.setNota1(ler.nextDouble());
        
        System.out.println("Digite a segunda nota do aluno:");
        aluno.setNota2(ler.nextDouble());
        
        aluno.exibirDadosAluno();
        ler.close();
    }
}   

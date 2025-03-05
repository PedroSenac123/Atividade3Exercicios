package ulbra.br.exer4;
import java.util.Scanner;

public class TestarExer4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Exer4 calc = new Exer4();
            
            System.out.print("Digite um número: ");
            calc.setNumero(scanner.nextDouble());
            
            System.out.println("Número: " + calc.getNumero());
            System.out.print("Digite um valor para somar: ");
            System.out.println("Soma: " + calc.somar(scanner.nextDouble()));
            
            System.out.print("Digite um valor para subtrair: ");
            System.out.println("Subtração: " + calc.subtrair(scanner.nextDouble()));
            
            System.out.print("Digite um valor para multiplicar: ");
            System.out.println("Multiplicação: " + calc.multiplicar(scanner.nextDouble()));
            
            System.out.print("Digite um valor para dividir: ");
            System.out.println("Divisão: " + calc.dividir(scanner.nextDouble()));
            
            System.out.println("Raiz Quadrada: " + calc.raizQuadrada());
            
            System.out.print("Digite um expoente para calcular a potência: ");
            System.out.println("Potência: " + calc.potencia(scanner.nextDouble()));
            
            System.out.println("Fatorial: " + calc.fatorial());
        }
    }
}

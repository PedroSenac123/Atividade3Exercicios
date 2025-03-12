
package ulbra.br.exer10;

import java.util.Scanner;


public class TestarExer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Exer10 temp = new Exer10();

        System.out.print("Digite a temperatura em Celsius: ");
        temp.setCelsius(scanner.nextDouble());

        System.out.println("\nConversões de temperatura:");
        temp.exibirTemperaturas();

        scanner.close();
    }
}

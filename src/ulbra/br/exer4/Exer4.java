package ulbra.br.exer4;


public class Exer4 {
    private double numero;

    public Exer4() {
    }

    public Exer4(double numero) {
        this.numero = numero;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public double somar(double valor) {
        return numero + valor;
    }

    public double subtrair(double valor) {
        return numero - valor;
    }

    public double multiplicar(double valor) {
        return numero * valor;
    }

    public double dividir(double valor) {
        if (valor == 0) {
            System.out.println("Erro: Divisão por zero não permitida.");
            return 0;
        }
        return numero / valor;
    }    
    public double raizQuadrada() {
        if (numero < 0) {
            System.out.println("Erro: Número negativo não possui raiz quadrada real.");
            return 0;
        }
        return Math.sqrt(numero);
    }
    public double potencia(double expoente) {
        return Math.pow(numero, expoente);
    }
    public long fatorial() {
        if (numero < 0 || numero != (int) numero) {
            System.out.println("Erro: O número deve ser inteiro e não negativo para calcular o fatorial.");
            return 0;
        }
        long resultado = 1;
        for (int i = 1; i <= (int) numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}


package ulbra.br.exer5;


public class Exer5 {
    private String titular;
    private double saldo;

    public Exer5() {
    }

    public Exer5(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
        } else if (valor > 0) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
    public double calcularRendimento(double taxa) {
        return saldo * (taxa / 100);
    }
}

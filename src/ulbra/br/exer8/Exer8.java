
package ulbra.br.exer8;


public class Exer8 {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void reajustarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }

    public double calcularSalarioAnual() {
        return salario * 12;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário atual: R$ " + salario);
        System.out.println("Salário anual: R$ " + calcularSalarioAnual());
    }
}


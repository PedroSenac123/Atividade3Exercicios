
package ulbra.br.exer2;


public class Exer2 {
    private String nome;
    private int idade;
    private double altura;

    public Exer2() {
    }

    public Exer2(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
    }
    public boolean maiorDeIdade() {
        return idade >= 18;
    }

    public int anosParaCem() {
        return 100 - idade;
    }
    
    
    
}


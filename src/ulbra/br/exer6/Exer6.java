package ulbra.br.exer6;

public class Exer6 {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private boolean aprovado;

    public Exer6() {
    }

    public Exer6(String nome, double nota1, double nota2, double media, boolean aprovado) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.media = media;
        this.aprovado = aprovado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean verificarAprovacao() {
        return calcularMedia() >= 7.0;
    }
    
    public void exibirDadosAluno(){
        System.out.println("Nome do aluno:" + nome);
        System.out.println("Primeira nota foi:" + nota1);
        System.out.println("Segunda nota foi:" + nota2);
        System.out.println("A média do aluno foi:" + media);
        System.out.println("Média: " + calcularMedia());
        if (verificarAprovacao()) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }
    }
    
}

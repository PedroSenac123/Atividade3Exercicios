package ulbra.br.exer9;

public class Exer9 {

    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginasLidas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setPaginasLidas(int paginasLidas) {
        if (paginasLidas <= totalPaginas) {
            this.paginasLidas = paginasLidas;
        } else {
            this.paginasLidas = totalPaginas;
        }
    }

    public int getPaginasLidas() {
        return paginasLidas;
    }

    public double calcularProgresso() {
        return ((double) paginasLidas / totalPaginas) * 100;
    }

    public boolean leituraCompleta() {
        return paginasLidas == totalPaginas;
    }

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + totalPaginas);
        System.out.println("Páginas lidas: " + paginasLidas);
        System.out.println("Progresso: " + calcularProgresso() + "%");
        System.out.println(leituraCompleta() ? "Leitura concluída!" : "Leitura em andamento.");
    }
}

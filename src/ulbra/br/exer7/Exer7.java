package ulbra.br.exer7;

public class Exer7 {

    private String modelo;
    private double consumoPorKm;
    private double KmPercorrido;
    private double consumoViagem;

    public Exer7() {
    }

    public Exer7(String modelo, double consumoPorKm, double KmPercorrido, double consumoViagem) {
        this.modelo = modelo;
        this.consumoPorKm = consumoPorKm;
        this.KmPercorrido = KmPercorrido;
        this.consumoViagem = consumoViagem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoPorKm() {
        return consumoPorKm;
    }

    public void setConsumoPorKm(double consumoPorKm) {
        this.consumoPorKm = consumoPorKm;
    }

    public double getKmPercorrido() {
        return KmPercorrido;
    }

    public void setKmPercorrido(double KmPercorrido) {
        this.KmPercorrido = KmPercorrido;
    }

    public double getConsumoViagem() {
        return consumoViagem;
    }

    public void setConsumoViagem(double consumoViagem) {
        this.consumoViagem = consumoViagem;
    }

    
    

    public double calcularConsumo(double distancia) {
        return distancia / consumoPorKm;
    }

    public double estimarCustoViagem(double distancia, double precoCombustivel) {
        double litrosNecessarios = calcularConsumo(distancia);
        return litrosNecessarios * precoCombustivel;
    }
}

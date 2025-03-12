
package ulbra.br.exer10;

public class Exer10 {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double converterParaFahrenheit() {
        return (celsius * 9/5) + 32;
    }

    public double converterParaKelvin() {
        return celsius + 273.15;
    }

    public void exibirTemperaturas() {
        System.out.println("Temperatura em Celsius: " + celsius + "°C");
        System.out.println("Temperatura em Fahrenheit: " + converterParaFahrenheit() + "°F");
        System.out.println("Temperatura em Kelvin: " + converterParaKelvin() + "K");
    }
}


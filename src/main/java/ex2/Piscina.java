package ex2;

public class Piscina {
    private double largo;
    private double ancho;
    private double profundidad;

    public Piscina(double largo, double ancho, double profundidad) {
        this.largo = largo;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double calcularVolumen() {
        double volumen = 0;
        volumen = largo * ancho * profundidad;
        return volumen;
    }

    public double calcularAgua() {
        double totalAgua = 0;
        double tope = 0.75;
        totalAgua = calcularVolumen() * tope;
        return totalAgua;
    }

    public double calcularCloro() {
        double totalCloro = 0;
        double cloroNecesario = 0.015;

        totalCloro = (calcularAgua() / 1.5) * cloroNecesario;
        return totalCloro;
    }
}
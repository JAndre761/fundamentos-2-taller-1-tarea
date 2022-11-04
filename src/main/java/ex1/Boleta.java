package ex1;

public class Boleta {
    private double monto;

    public Boleta(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double calcularIGV() {
        double total = 0;

        total = monto * 0.18;
        total = formatearDecimales(total, 3);
        return total;
    }

    public double totalAPagar() {
        double total = 0;
        double igv = calcularIGV();
        total = monto + igv;
        total = formatearDecimales(total, 3);
        return total;
    }

    public static double formatearDecimales(double numero, Integer numeroDecimales) {
        return Math.round(numero * Math.pow(10, numeroDecimales)) / Math.pow(10, numeroDecimales);
    }
}
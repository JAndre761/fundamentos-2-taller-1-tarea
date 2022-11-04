package ex1;

public class Main {
    public static void main(String[] args) {
        Boleta bol1 = new Boleta(10.0);

        System.out.println("El igv es: " + bol1.calcularIGV());
        System.out.println("El monto total a pagar es: " + bol1.totalAPagar());
    }
}
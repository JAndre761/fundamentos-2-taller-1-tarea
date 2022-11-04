package ex2;

public class Main {
    public static void main(String[] args) {

        Piscina pisc1 = new Piscina(10, 10, 10);

        System.out.println("El volumen de la piscina es: " + pisc1.calcularVolumen());
        System.out.println("El maximo de agua es: " + pisc1.calcularAgua());
        System.out.println("La cantidad de cloro a utilizar es: " + pisc1.calcularCloro());
    }
}
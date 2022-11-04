package ex3;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno("TONES123", "Alumno1", "Apellido1", 15, 20, 20, 15);

        alu1.saludar();
        System.out.println("El promedio es: " + alu1.calcularNota());
        System.out.println("El alumno esta: " + alu1.aprobado());
    }
}
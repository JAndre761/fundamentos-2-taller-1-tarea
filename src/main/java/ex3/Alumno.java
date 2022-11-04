package ex3;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellidos;
    private double notaPC1;
    private double notaPC2;
    private double notaParticipacion;
    private double notaFinal;

    public Alumno(String codigo, String nombre, String apellidos, double notaPC1, double notaPC2, double notaParticipacion, double notaFinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.notaPC1 = notaPC1;
        this.notaPC2 = notaPC2;
        this.notaParticipacion = notaParticipacion;
        this.notaFinal = notaFinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getNotaPC1() {
        return notaPC1;
    }

    public void setNotaPC1(double notaPC1) {
        this.notaPC1 = notaPC1;
    }

    public double getNotaPC2() {
        return notaPC2;
    }

    public void setNotaPC2(double notaPC2) {
        this.notaPC2 = notaPC2;
    }

    public double getNotaParticipacion() {
        return notaParticipacion;
    }

    public void setNotaParticipacion(double notaParticipacion) {
        this.notaParticipacion = notaParticipacion;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " " + apellidos);
    }

    public double calcularNota() {
        double notaFinal = 0;
        notaFinal = (notaPC1 * 0.2) + (notaPC2 * 0.25) + (notaParticipacion * 0.25) + (notaFinal * 0.30);
        return notaFinal;
    }

    public String aprobado() {
        if (calcularNota() >= 13) {
            return "Aprobado";
        } else {
            return "Desaprobado";
        }
    }
}
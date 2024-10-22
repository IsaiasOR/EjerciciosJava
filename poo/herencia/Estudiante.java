package herencia;

public class Estudiante extends Persona {
    private int codEstudiante;
    private float notaFinal;

    public Estudiante(String nombre, String apellido, int edad, int codEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codEstudiante = codEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println(
                "Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCódigo del estudiante: " + this.codEstudiante +
                "\nNota final: " + this.notaFinal);
    }
}

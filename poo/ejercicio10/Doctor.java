package ejercicio10;

public class Doctor extends Persona {
    private String titulacion;
    private int aniosExperiencia;

    public Doctor(String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String curarLesion() {
        return nombre + " " + apellido + " está tratando una lesión. Titulación: " + titulacion + ", Experiencia: " + aniosExperiencia + " años.";
    }
}

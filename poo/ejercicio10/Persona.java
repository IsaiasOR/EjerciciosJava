package ejercicio10;

public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String viaje() {
        return nombre + " " + apellido + " está viajando con el equipo.";
    }

    public String entrenamiento() {
        return nombre + " " + apellido + " está en el entrenamiento.";
    }
}

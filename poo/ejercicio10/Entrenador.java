package ejercicio10;

public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, String apellido, int edad, String estrategia) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String planificarEntrenamiento() {
        return nombre + " " + apellido + " planifica el entrenamiento con la estrategia: " + estrategia + ".";
    }
}

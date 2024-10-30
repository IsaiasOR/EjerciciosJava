package ejercicio10;

public class Futbolista extends Persona {
    private int dorsal;
    private String posicion;

    public Futbolista(String nombre, String apellido, int edad, int dorsal, String posicion) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String partidoFutbol() {
        return nombre + " " + apellido + " juega en la posición " + posicion + " y con el dorsal " + dorsal + ".";
    }

    public String entrevista() {
        return nombre + " " + apellido + " está en una entrevista.";
    }
}

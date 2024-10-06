package ejercicio4;

/*
Ejercicio 4:
Construir un programa para una competencia de atletismo,
el programa debe gestionar una serie de atletas caracterizados por su
número de atleta, nombre y tiempo de carrera,
al final el programa debe mostrar los datos del atleta ganador de la carrera.
 */

public class Atleta {
    private int numAtleta;
    private String nombre;
    private float tiempoCarrera;

    public Atleta(int numAtleta, String nombre, float tiempoCarrera) {
        this.numAtleta = numAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getNumAtleta() {
        return numAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public float getTiempoCarrera() {
        return tiempoCarrera;
    }

    @Override
    public String toString() {
        return "Número de atleta: " + this.numAtleta +
                "\nNombre: " + this.nombre +
                "\nTiempo de la carrera: " + this.tiempoCarrera + "\n";
    }
}

package ejercicio2;

/*
Ejercicio 2:
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y
actualice su posición dentro del mismo.
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
 */

public class Movimiento {
    private int x;
    private int y;

    public Movimiento() {
        x = 5;
        y = 5;
    }

    public void arriba() {
        y++;
    }

    public void abajo() {
        y--;
    }

    public void izquierda() {
        x--;
    }

    public void derecha() {
        x++;
    }

    public String getCooerdenadas() {
        String coordenadas = "Las coordenada es: (" + this.x + ";" + this.y + ")";
        return coordenadas;
    }

}

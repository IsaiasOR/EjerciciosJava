package ejercicio2;

/*
Ejercicio 2:
Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y
actualice su posición dentro del mismo.
Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA.
Tras cada movimiento el programa mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero.
 */

public class Movimiento {
    //private int [][] tablero;
    private int x;
    private int y;

    public Movimiento() {
        //tablero = new int[10][10];
        x = 5;
        y = 5;
    }

    public void arriba() {
        System.out.println("Dirección ARRIBA");
        y++;
        System.out.println("La nueva coordenada es: (" + x + ";" + y + ")");
    }

    public void abajo() {
        System.out.println("Dirección ABAJO");
        y--;
        System.out.println("La nueva coordenada es: (" + x + ";" + y + ")");
    }

    public void izquierda() {
        System.out.println("Dirección IZQUIERDA");
        x--;
        System.out.println("La nueva coordenada es: (" + x + ";" + y + ")");
    }

    public void derecha() {
        System.out.println("Dirección DERECHA");
        x++;
        System.out.println("La nueva coordenada es: (" + x + ";" + y + ")");
    }

}

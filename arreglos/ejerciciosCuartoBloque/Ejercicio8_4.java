package ejerciciosCuartoBloque;

/*
Ejercicio 8: Diseñar una aplicación que declare una tabla
de 10 elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo en la
posición indicada, desplazando los que estén detrás.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tabla = new int[10];

        // Lectura de los 9 números
        System.out.println("Introduce 9 números:");
        for (int i = 0; i < 9; i++) {
            tabla[i] = scanner.nextInt();
        }

        // Pedir número y posición
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();

        System.out.print("Introduce una posición (Entre 0 y 9): ");
        int posicion = scanner.nextInt();

        // Insertar el número en la posición
        if (posicion >= 0 && posicion <= 9) {
            for (int i = 9; i > posicion; i--) {
                tabla[i] = tabla[i - 1];
            }
            tabla[posicion] = numero;

            System.out.print("Nuevo arreglo: " + Arrays.toString(tabla));
        } else {
            System.out.print("Posición inválida");
        }
    }
}

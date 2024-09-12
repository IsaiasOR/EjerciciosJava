package ejerciciosMatrices;

/*
Ejercicio4: Crear una matriz de tamaño 7x7 y rellenarla de forma
que los elementos de la diagonal principal sean 1 y el resto 0.
 */

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[7][7];

        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz:");
        for (int i=0; i<7; i++) {
            for (int j=0; j<7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

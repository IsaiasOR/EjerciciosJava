package ejerciciosMatrices;

/*
Ejercicio 5: Crear y cargar una matriz de tamaño n x m,
mostrar la suma de cada fila y de cada columna.
 */

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][];
        int nFilas;
        int nCol;
        int sumaFilas;
        int sumaColum;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de filas de la matriz: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de columnas de la matriz: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz: ");
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("");

        System.out.println("La matriz es:");
        for (int i=0; i<nFilas; i++) {
            for (int j=0; j<nCol; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Suma de cada fila
        for (int i=0; i<nFilas; i++) {
            sumaFilas = 0;
            for (int j=0; j<nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            System.out.println("La suma de la fila n°" + (i+1) + " es: " + sumaFilas);
        }
        System.out.println("");

        //Suma de cada columna
        for (int j=0; j<nCol; j++) {
            sumaColum = 0;
            for (int i=0; i<nFilas; i++) {
                sumaColum += matriz[i][j];
            }
            System.out.println("La suma de la columna n°" + (j+1) + " es: " + sumaColum);
        }
    }
}

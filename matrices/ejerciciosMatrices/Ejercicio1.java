package ejerciciosMatrices;

/*
Ejercicio 1: Crear y cargar una matriz de tamaño n x m y decir si es simétrica o no.
 */

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][];
        int nFilas;
        int nCol;
        boolean simetrica = true;

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

        if (nFilas == nCol) {
            int i, j;
            i = 0;
            while ((i < nFilas) && (simetrica)) {
                j = 0;
                while ((j < nCol) && (simetrica)) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            System.out.print(simetrica ? "La matriz sí es simétrica" : "La matriz no es simétrica");


        } else {
            System.out.print("La matriz no es simétrica");
        }
    }
}

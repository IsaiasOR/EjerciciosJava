package ejerciciosMatrices;

import javax.swing.*;
import java.util.Scanner;

/*
Ejercicio 2:
Crear y cargar dos matrices de 3x3,
sumarlas y mostrar su suma.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int matrizSuma[][] = new int[3][3];

        System.out.println("Digite la primera matriz: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Matriz1 ["+i+"]["+j+"]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite la segunda matriz: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Matriz2 ["+i+"]["+j+"]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        System.out.println("Las matrices sumadas dan como resultado: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matrizSuma[i][j]);
            }
            System.out.println("");
        }
    }
}

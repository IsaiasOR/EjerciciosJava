package ejerciciosMatrices;

/*
Ejercicio 3: Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matriz[][] = new int[3][3];

        System.out.println("Digite la matriz: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz original:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

        //Usando otra matriz
        /*
        int matrizT[][] = new int[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                matrizT[i][j] = matriz[j][i];
            }
        }

         */


        int aux;
        for (int i=0; i<3; i++) {
            for (int j=0; j<i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }


        System.out.println("La matriz transpuesta:");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

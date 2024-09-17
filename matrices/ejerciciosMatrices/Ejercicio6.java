package ejerciciosMatrices;

/*
Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5,
cargar la primera y trasponerla en la segunda.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        int matriz1[][] = new int[5][9];
        int matriz2[][] = new int[9][5];

        //Llenado de la matriz
        for (int i=0; i<5; i++) {
            for (int j=0; j<9; j++) {
                matriz1[i][j] = (j+1);
            }
        }

        //Mostrar la matriz
        System.out.println("La matriz original es:");
        for (int i=0; i<5; i++) {
            for (int j=0; j<9; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println("");
        }

        //Trasponer la matriz
        for (int i=0; i<5; i++) {
            for (int j=0; j<9; j++) {
                matriz2[j][i] = matriz1[i][j];
            }
        }
        System.out.println("");

        //Mostrar la matriz traspuesta
        System.out.println("La matriz traspuesta es:");
        for (int i=0; i<9; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println("");
        }

    }
}

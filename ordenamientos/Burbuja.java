import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Burbuja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[];
        int n;
        int aux;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        arreglo = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print((i+1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }

        //Métodos

        /*
        for (int i=0; i<(n-1); i++) {
            for (int j=0; j<(n-1); j++) {

                if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                }
            }
        }

         */


        boolean bandera;

        do {
            bandera = true;
            for (int i=0; i<(n-1); i++) {
                if (arreglo[i] > arreglo[i+1]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[i+1];
                    arreglo[i+1] = aux;
                    bandera = false;
                }
            }
        } while (!bandera);



        System.out.println("Arreglo ordenado en forma creciente: " + Arrays.toString(arreglo));

        /*

        //Arreglo ordenado de forma decreciente
        int arreglo2[] = new int[n];
        for (int i=1; i<=n; i++) {
            arreglo2[i-1] = arreglo[n-i];
        }
        System.out.println("Arreglo ordenado en forma decreciente: " + Arrays.toString(arreglo2));

         */
    }
}

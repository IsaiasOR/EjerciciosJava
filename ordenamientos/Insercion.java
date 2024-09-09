import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Insercion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[];
        int n;
        int aux;
        int posicion;

        n = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos del arreglo"));

        arreglo = new int[n];

        for (int i=0; i<n; i++) {
            System.out.print((i+1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i=0; i<n; i++) {
            posicion = i;
            aux = arreglo[i];

            while ((posicion > 0) && (arreglo[posicion - 1] > aux)) {
                arreglo[posicion] = arreglo[posicion - 1];
                posicion--;
            }

            arreglo[posicion] = aux;
        }

        System.out.println("Arreglo ordenado en forma creciente: " + Arrays.toString(arreglo));

        System.out.println("Arreglo ordenado en forma decreciente");
        for (int i=(n-1); i>=0; i--) {
            System.out.print(arreglo[i] + " - ");
        }
    }
}

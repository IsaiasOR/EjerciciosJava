package ejerciciosCuartoBloque;

/*
Ejercicio 13:
Leer 10 enteros.
Guardar en otra tabla los elementos pares de la primera, y
a continuación los elementos impares.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo[] = new int[10];
        short conteoPares = 0;
        short conteoImpares = 0;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + 1 + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();

            if ((arreglo[i] % 2) == 0) {
                conteoPares++;
            } else {
                conteoImpares++;
            }
        }

        int pares[] = new int[conteoPares];
        int impares[] = new int[conteoImpares];

        short x = 0;
        short j = 0;

        for (int i=0; i<10; i++) {
            if ((arreglo[i] % 2) == 0) {
                pares[x] = arreglo[i];
                x++;
            } else {
                impares[x] = arreglo[i];
                j++;
            }
        }

        System.out.println("Aregglo de número pares: " + Arrays.toString(pares));
        System.out.println("Aregglo de número impares: " + Arrays.toString(impares));
    }
}

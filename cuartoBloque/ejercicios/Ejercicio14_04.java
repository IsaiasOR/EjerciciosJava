package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

/*
Ejercicio 14:
Leer dos series de 10 enteros,
que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */
public class Ejercicio14_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arreglo1[] = new int[10];
        int arreglo2[] = new int[10];
        int arregloTotal[] = new int[20];


        boolean creciente1, creciente2;

        do {
            creciente1 = true;
            System.out.println("Digite el primer arreglo:");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + 1 + ". Digite un número: ");
                arreglo1[i] = scanner.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo1[i] > arreglo1[i + 1]) {
                    creciente1 = false;
                    break;
                }
            }

            if (!creciente1) {
                System.out.println("El primer arreglo no está ordenado de forma creciente. Vuelva a digitar los números");
            }

        } while (!creciente1);


        do {
            creciente2 = true;
            System.out.println("Digite el segundo arreglo:");
            for (int i = 0; i < 10; i++) {
                System.out.print(i + 1 + ". Digite un número: ");
                arreglo2[i] = scanner.nextInt();
            }

            for (int i = 0; i < 9; i++) {
                if (arreglo2[i] > arreglo2[i + 1]) {
                    creciente2 = false;
                    break;
                }
            }

            if (!creciente2) {
                System.out.println("El segundo arreglo no está ordenado de forma creciente. Vuelva a digitar los números");
            }

        } while (!creciente2);




        /*
        for (int i = 0; i < 10; i++) {
            arreglo1[i] = i + 20;
        }
        for (int i = 0; i < 10; i++) {
            arreglo2[i] = i * 2;
        }

         */

        int i = 0, j = 0, k = 0;

        while (i < 10 && j < 10) {
            if (arreglo1[i] <= arreglo2[j]) {
                arregloTotal[k++] = arreglo1[i++];
            } else {
                arregloTotal[k++] = arreglo2[j++];
            }
        }

        // Copiar los elementos restantes de arreglo1, si los hay
        while (i < 10) {
            arregloTotal[k++] = arreglo1[i++];
        }

        // Copiar los elementos restantes de arreglo2, si los hay
        while (j < 10) {
            arregloTotal[k++] = arreglo2[j++];
        }

        System.out.println("El nuevo arreglo fusionado: " + Arrays.toString(arregloTotal));

        /*
        Dado que los arreglos ya están ordenados de forma creciente, el objetivo principal es fusionarlos manteniendo ese orden.
        Esto se logra mediante la comparación de los elementos correspondientes en ambos arreglos,
        lo cual se realiza en el bucle while.
        Durante la ejecución del while, se compara el elemento actual de cada arreglo;
        el menor de los dos se almacena en el arreglo fusionado arregloTotal.
        Si uno de los índices (i o j) alcanza el valor 10, significa que todos los elementos de ese
        arreglo ya han sido copiados a arregloTotal. En este punto, solo resta
        copiar los elementos restantes del otro arreglo al final de arregloTotal.
         */
    }
}

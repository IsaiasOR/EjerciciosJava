package ejerciciosCuartoBloque;
/*
Ejercicio 11:
Leer 5 elementos numéricos que se introducirán ordenados de forma creciente.
Éstos los guardaremos en una tabla de tamaño 10.
Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio11_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];
        boolean creciente = true;
        int num, sitio_num = 0, j = 0;

        do {
            //Lenar la tabla
            for (int i=0; i<5; i++) {
                System.out.print(i+1 + ". Digite un número: ");
                tabla[i] = scanner.nextInt();
            }

            //Comprobar si la tabla está ordenada de forma creciente
            for (int i=0; i<4; i++) {
                if (tabla[i] < tabla[i+1]) {
                    creciente = true;
                }
                if (tabla[i] > tabla[i+1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("La tabla no está ordenada de forma creciente. Vuelva a digitar los números");
            }

        } while (creciente == false);


        System.out.print("Digite un nuevo número a almacenar en la tabla: ");
        num = scanner.nextInt();

        //Para darnos cuenta en qué posición va el número
        while (tabla[j] < num && j<5) {
            sitio_num++;
            j++;
        }

        //Trasladamos las posicione de los arreglos
        for (int i=4; i>=sitio_num; i--) {
            tabla[i+1] = tabla[i];
        }

        //Se inserta el nuevo número
        tabla[sitio_num] =num;

        System.out.println("La nueva tabla es: " + Arrays.toString(tabla));
    }
}

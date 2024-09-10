package ejerciciosCuartoBloque;

/*
Ejercicio 10:
Crear un programa que lea por teclado una tabla de 10
número entero y desplace N posiciones en el arreglo
(N es digitado por el usuario)
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios10_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];

        for (int i=0; i<10; i++) {
            System.out.print(i+1 + ". Digite un número: ");
            tabla[i] = scanner.nextInt();
        }
        System.out.print("¿Cuántas posiciones quiere que se desplacen los números? Digite el número: ");
        int posiciones = scanner.nextInt();


        for (int j=1; j<=posiciones; j++) {
            int ultimo = tabla[9];

            for (int i=9; i>0; i--) {
                tabla[i] = tabla[i-1];
            }
            tabla[0] = ultimo;
        }


        System.out.println("La nueva tabla con desplazamientos: " + Arrays.toString(tabla));
    }
}

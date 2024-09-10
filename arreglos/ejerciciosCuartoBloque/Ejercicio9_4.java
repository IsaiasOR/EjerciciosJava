package ejerciciosCuartoBloque;

/*
Ejercicio 9: Crear un programa que lea por teclado una
tabla de 10 números enteros y la desplace una posición hacia abajo:
el primero pasa a ser el segundo,
el segundo pasa a ser el tercero
y así sucesivamente. El último pasa a ser el primero. */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];

        for (int i=0; i<10; i++) {
            System.out.print(i+1 + ". Digite un número: ");
            tabla[i] = scanner.nextInt();
        }

        int ultimo = tabla[9];

        for (int i=9; i>0; i--) {
            tabla[i] = tabla[i-1];
        }
        tabla[0] = ultimo;

        System.out.println("La nueva tabla con desplazamientos: " + Arrays.toString(tabla));
    }
}

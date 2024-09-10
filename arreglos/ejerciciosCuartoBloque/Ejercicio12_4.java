package ejerciciosCuartoBloque;

/*
Ejercicio 12:
Leer por teclado una tabla de 10 elementos numéricos enteros
y una posición (entre o y 9).
Eliminar el elemento situado en la posición dada sin dejar huecos.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla[] = new int[10];
        int posicion;
        boolean bandera = true;

        for (int i=0; i<10; i++) {
            System.out.print(i+1 + ". Digite un número: ");
            tabla[i] = scanner.nextInt();
        }

        do {
            System.out.print("Digite una posición entre 0 y 9: ");
            posicion = scanner.nextInt();

            if (posicion >= 0 && posicion <= 9) {
                bandera = true;
            } else {
                System.out.println("El número digitado no es correro. Digite uno nuevo.");
                bandera = false;
            }

        } while (bandera == false);


        for (int i=posicion; i<9; i++) {
            tabla[i] = tabla[i+1];
        }
        tabla[9] = 0;

        System.out.println("La nueva tabla es: " + Arrays.toString(tabla));
    }
}

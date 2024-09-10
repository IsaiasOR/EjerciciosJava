package ejerciciosCuartoBloque;

/*
Leer por teclado una serie de 10 número enteros.
La aplicación debe indicarnos si los números están
ordenados de forma creciente, decreciente o si
están desordenados.
 */
import java.util.Scanner;

public class Ejercicio7_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int array[] = new int[10];
        boolean creciente = false;
        boolean decreciente = false;

        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            array[i] = entrada.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            if(array[i] < array[i+1]) { //Si es creciente
                creciente = true;
            }

            if (array[i] > array[i+1]) { //Si es decreciente
                decreciente = true;
            }
        }

        if (creciente == true && decreciente == false) {
            System.out.println("\nEl arreglo está en forma creciente");
        }

        if (creciente == false && decreciente == true) {
            System.out.println("\nEl arreglo está en forma decreciente");
        }

        if (creciente == true && decreciente == true) {
            System.out.println("\nEl arreglo está desordenado");
        }

        if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los números del arrego son iguales");
        }
    }
}

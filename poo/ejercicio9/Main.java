package ejercicio9;
/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos
(Triángulos y Rectángulos) el programa debe ser capaz de almacenar
en un arreglo N triángulos y rectángulos, y al final mostrar el área
y los datos de cada uno. Para ello se tendrá lo siguiente:

Una super clase llamada Polígono.
Una sub clase llamada Rectángulo.
Una sub clase llamada Triángulo.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.print("Ingrese la cantidad de polígonos a ingresar: ");
        n = scanner.nextInt();
        Poligono[] poligonos = new Poligono[n];

        System.out.println("Ingrese los datos de los polígonos");
        for (int i=0; i<n; i++) {
            System.out.println();
        }
    }
}

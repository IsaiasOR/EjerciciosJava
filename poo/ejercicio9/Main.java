package ejercicio9;
/*
Ejercicio 9: Hacer un programa para calcular el área de Polígonos
(Triángulos y Rectángulos) el programa debe ser capaz de almacenar
en un arreglo N triángulos y rectángulos, y al final mostrar el área
y los datos de cada uno. Para ello se tendrá lo siguiente:

 - Una super clase llamada Polígono.
 - Una sub clase llamada Rectángulo.
 - Una sub clase llamada Triángulo.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Poligono> poligonos = new ArrayList<Poligono>();
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultados();

    }

    public static void llenarPoligono() {
        int opcion;
        char respuesta;

        do {
            do {
                opcion = menu();
            } while (opcion < 1 || opcion > 2);

            switch (opcion) {
                case 1: llenarTriangulo();
                    break;
                case 2: llenarRetangulo();
                    break;
            }

            System.out.println("\n¿Desea introducir otro polígono?: (s/n)");
            respuesta = scanner.next().charAt(0);
            System.out.println("");

        } while (respuesta == 's' || respuesta == 'S');
    }

    public static int menu() {
        int opcion;

        System.out.println("\nDigite el polígono que desea: ");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.print("OPCIÓN ELEGIDA: ");
        opcion = scanner.nextInt();

        return opcion;
    }

    public static void llenarTriangulo() {
        Triangulo triangulo;
        double lado1;
        double lado2;
        double lado3;

        System.out.print("\nDigite el lado 1 del triángulo: ");
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2 del triángulo: ");
        lado2 = scanner.nextDouble();
        System.out.print("Digite el lado 3 del triángulo: ");
        lado3 = scanner.nextDouble();

        triangulo = new Triangulo(lado1, lado2, lado3);
        poligonos.add(triangulo);
    }

    public static void llenarRetangulo() {
        Rectangulo rectangulo;
        double lado1;
        double lado2;

        System.out.print("\nDigite el lado 1 del rectángulo: ");
        lado1 = scanner.nextDouble();
        System.out.print("Digite el lado 2 del rectángulo: ");
        lado2 = scanner.nextDouble();

        rectangulo = new Rectangulo(lado1, lado2);
        poligonos.add(rectangulo);
    }

    private static void mostrarResultados() {
        System.out.println("A continuación se muestran los datos de los polígonos");
        for (Poligono p : poligonos) {
            System.out.println(p.toString());
            System.out.println("El área es: " + p.area());
            System.out.println("-------------------------------------------");
        }
    }
}

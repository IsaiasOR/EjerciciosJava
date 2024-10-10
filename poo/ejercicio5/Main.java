package ejercicio5;

import java.util.Scanner;

public class Main {

    public static double mayorArea(Triangulo triangulos[]) {
        double area;
        area = triangulos[0].getArea();

        for (int i=1; i < triangulos.length; i++) {
            if (triangulos[i].getArea() > area) {
                area = triangulos[i].getArea();
            }
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadTri;
        double base;
        double lado;

        System.out.print("Digite la cantidad de triángulos: ");
        cantidadTri = scanner.nextInt();

        Triangulo triangulos[] = new Triangulo[cantidadTri];

        for (int i=0; i < cantidadTri; i++) {
            System.out.println("\nDigite los valores para el triángulo N°" + (i+1) + ":");
            System.out.println("--------------------------------------------------------");

            System.out.print("Introduzca la base: ");
            base = scanner.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = scanner.nextDouble();

            triangulos[i] = new Triangulo(base, lado);

            System.out.println("\nEl perímetro del triángulo es: " + triangulos[i].getPerimetro());
            System.out.println("El área del triángulo es: " + triangulos[i].getArea());
        }

        System.out.println("--------------------------------------------------------");
        System.out.println("\nEl área de mayor superficie es: " + mayorArea(triangulos));
        System.out.println("--------------------------------------------------------");

    }
}

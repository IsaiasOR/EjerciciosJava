package ejercicio3;

import java.util.Scanner;

public class Main {
    public static int indiceCocheBarato(Vehiculo coches[]) {
        double precio;
        int indice = 0;

        precio = coches[0].getPrecio();

        for (int i=1; i<coches.length; i++) {
            if (coches[i].getPrecio() < precio) {
                precio = coches[i].getPrecio();
                indice = i;
            }
        }

        return indice;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String marca;
        String modelo;
        double precio;
        int numVehiculos;
        int indice;

        System.out.print("Digite la cantidad de vehiculos: ");
        numVehiculos = sc.nextInt();

        Vehiculo coches[] = new Vehiculo[numVehiculos];

        for (int i=0; i<numVehiculos; i++) {
            sc.nextLine();

            System.out.println("Digite las características del coche " + (i+1) + ": ");
            System.out.print("Introduzca la Marca: ");
            marca = sc.nextLine();
            System.out.print("Introduzca el Modelo: ");
            modelo = sc.nextLine();
            System.out.print("Introduzca el Precio: ");
            precio = sc.nextDouble();

            coches[i] = new Vehiculo(marca, modelo, precio);
        }

        indice = indiceCocheBarato(coches);

        System.out.println("\nEl coche más barato es: ");
        System.out.println(coches[indice].mostrarDatos());

    }
}

package ejercicio10;

/*
Ejercicio 10: Crear un programa para simular un equipo de futbol
(futbolista, entrenador y doctor), para lo cual tendremos lo siguiente:

    - Una super clase Persona, que tendrá los siguientes datos:
    nombre, apellido, edad.
    - La sub clase Futbolista tendrá los siguientes datos: dorsal y posición.
    - La sub clase Entrenador tendrá de dato la estrategia que utiliza.
    - La sub clase Doctor, la titulación y los años de experiencia.

Hacer un menú donde se tengan las siguientes opciones: Viaje de equipo, entrenamiento,
partido de futbol, planificar entrenamiento, entrevista, curar lesión.
 */

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista("Lionel", "Messi", 35, 10, "Delantero");
        Entrenador entrenador = new Entrenador("Pep", "Guardiola", 50, "Posesión");
        Doctor doctor = new Doctor("Juan", "Pérez", 45, "Medicina Deportiva", 20);
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.println();
                    System.out.println(futbolista.viaje());
                    System.out.println(entrenador.viaje());
                    System.out.println(doctor.viaje());
                    break;
                case 2:
                    System.out.println();
                    System.out.println(futbolista.entrenamiento());
                    System.out.println(entrenador.entrenamiento());
                    System.out.println(doctor.entrenamiento());
                    break;
                case 3:
                    System.out.println();
                    System.out.println(futbolista.partidoFutbol());
                    break;
                case 4:
                    System.out.println();
                    System.out.println(entrenador.planificarEntrenamiento());
                    break;
                case 5:
                    System.out.println();
                    System.out.println(futbolista.entrevista());
                    break;
                case 6:
                    System.out.println();
                    System.out.println(doctor.curarLesion());
                    break;
                case 0:
                    System.out.println("\nSaliendo del programa");
                    break;
                default:
                    System.out.println("\nOpción no válida.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    public static int menu() {
        int opcion;

        System.out.println("\nMenú de opciones: ");
        System.out.println("1. Viaje de equipo");
        System.out.println("2. Entrenamiento");
        System.out.println("3. Partido de futbol");
        System.out.println("4. Planificar entrenamiento");
        System.out.println("5. Entrevista");
        System.out.println("6. Curar lesión");
        System.out.println("0. Salir");
        System.out.print("Opción elegida: ");
        opcion = scanner.nextInt();

        return opcion;
    }


}

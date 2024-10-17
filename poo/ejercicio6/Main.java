package ejercicio6;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static int menu() {
        int opcion;

        System.out.println("\nCalculadora de números complejos");
        System.out.println();
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) MULTIPLICAR");
        System.out.println("4) DIVIDIR");
        System.out.println("5) SALIR");
        System.out.println();
        System.out.print("OPCION ELEGIDA: ");
        opcion = scanner.nextInt();

        return opcion;
    }

    public static void main(String[] args) {
        Complejo complejo1;
        Complejo complejo2;
        Complejo resultado;

        double real;
        double imaginario;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el primer real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo1 = new Complejo (real, imaginario);

                    System.out.print("Escribe el segundo real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo2 = new Complejo (real, imaginario);
                    resultado = complejo1.suma(complejo2);

                    if (resultado.getImaginario() < 0.0)
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +"+ i"+ -resultado.getImaginario());
                    else
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ resultado.getImaginario());
                    break;
                case 2:
                    System.out.print("Escribe el primer real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo1 = new Complejo (real, imaginario);

                    System.out.print("Escribe el segundo real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo2 = new Complejo (real, imaginario);
                    resultado = complejo1.resta(complejo2);

                    if (resultado.getImaginario() < 0.0)
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +"+ i"+ -resultado.getImaginario());
                    else
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ resultado.getImaginario());
                    break;
                case 3:
                    System.out.print("Escribe el primer real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo1 = new Complejo (real, imaginario);

                    System.out.print("Escribe el segundo real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo2 = new Complejo (real, imaginario);

                    resultado = complejo1.multiplicacion(complejo2);

                    if (resultado.getImaginario() < 0.0)
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ -resultado.getImaginario());
                    else
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ resultado.getImaginario());
                    break;
                case 4:
                    System.out.print("Escribe el primer real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el primer imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo1 = new Complejo (real, imaginario);

                    System.out.print("Escribe el segundo real: ");
                    real = scanner.nextDouble();
                    System.out.print("Escribe el segundo imaginario: ");
                    imaginario = scanner.nextDouble();

                    complejo2 = new Complejo (real, imaginario);

                    resultado = complejo1.division(complejo2);

                    if (resultado.getImaginario() < 0.0)
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ -resultado.getImaginario());
                    else
                        System.out.println("\nEl resultado es: " +
                                resultado.getReal() +" + i"+ resultado.getImaginario());
                    break;
                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}

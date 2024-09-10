package ejerciciosPrimerBloque;

import java.util.Scanner;

/*
 * Guillermo tiene N dólares.
 * Luis tiene la mitad de lo que posee Guillermo.
 * Juan tiene la mitad de lo que posee Luis y Guillermo Juntos.
 * Hacer un programa que calcule e imprima la cantidad de 
 * dinero que tienen entre los tres.
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		float guille, luis, juan, total;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
		guille = entrada.nextFloat();
		luis = guille / 2;
		juan = (guille + luis) / 2;
		total = guille + luis + juan;
		
		System.out.println("\nLa cantidad de dinero entre los tres es: "+total);
		
		
	}

}

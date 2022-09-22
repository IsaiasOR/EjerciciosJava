package ejercicios;

import java.util.Scanner;

/*
	 * Hacer un programa que calcule e imprima la suma de
	 * tres calificaciones.
	 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float nota1, nota2, nota3, suma;
		
		//Guardamos las tres notas
		System.out.print("Digite las tres calificaciones: ");
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		//Sumamos las tres notas
		suma = nota1 + nota2 + nota3;
		
		//ALT + 92 = \, para el salto de línea
		System.out.println("\nLa suma es: "+suma);
	}

}

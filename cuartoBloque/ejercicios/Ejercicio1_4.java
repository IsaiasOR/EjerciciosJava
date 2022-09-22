package ejercicios;

import java.util.Scanner;

/*
 * Leer 5 números, guardarlos en un arreglo y 
 * mostrarlos en el mismo orden que ingresaron.
 */

public class Ejercicio1_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		float numeros[] = new float[5];
		
		System.out.println("Guardando los datos en el arreglo");
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+". Ingrese un número: ");
			numeros[i] = entrada.nextFloat();
		}
		
		System.out.println("\nImprimir los elementos del arreglo");
		for(float i: numeros) {
			System.out.println(i);
		}
		
		
	}

}

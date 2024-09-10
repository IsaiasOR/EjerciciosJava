package ejerciciosCuartoBloque;
/*
 * Ejercicio 5: Leer por teclado dos tablas de 
 * 10 números enteros y mezclarlas en una tercera de 
 * la forma: el 1º de A, 
 * el 1ºde B, el 2º de A, el 2º de B, etc.
 */

import java.util.Scanner;

public class Ejercicio5_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[20];
		
		System.out.println("Digite el 1er arreglo");
		for(int i=0; i<10; i++) {
			System.out.print(i+1+". Digite un número: ");
			a[i] = entrada.nextInt();
		}
		
		System.out.println("Digite el 2do arreglo");
		for(int i=0; i<10; i++) {
			System.out.print(i+1+". Digite un número: ");
			b[i] = entrada.nextInt();
		}
		
		int j = 0;
		for(int i=0; i<10; i++) {
			c[j] = a[i];
			j++;
			c[j] = b[i];
			j++;
		}
		
		System.out.print("El 3er arreglo es: ");
		for(int i=0; i<20; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		
	}

}

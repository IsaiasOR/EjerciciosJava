package ejerciciosCuartoBloque;
/*
 * Leer 10 números enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: el primero,
 * el último, el segundo, el penúltimo, el tercero, etc.
 */

import java.util.Scanner;

public class Ejercicio4_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[10];
		
		System.out.println("Guardar los números en el arreglo");
		for(int i=0; i<10; i++) {
			System.out.print(i+1+". Digite un número: ");
			numeros[i] = entrada.nextInt();
		}
		
		for (int i=0;i<=4;i++){
			System.out.println(numeros[i]);
			System.out.println(numeros[9-i]);
		}
		
/*
			System.out.println(numeros[0]);
			System.out.println(numeros[9]);
			System.out.println(numeros[1]);
			System.out.println(numeros[8]);
			System.out.println(numeros[2]);
			System.out.println(numeros[7]);
			System.out.println(numeros[3]);
			System.out.println(numeros[6]);
			System.out.println(numeros[4]);
			System.out.println(numeros[5]);
*/
	}

}

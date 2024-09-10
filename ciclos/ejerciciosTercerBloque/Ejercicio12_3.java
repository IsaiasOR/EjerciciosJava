package ejerciciosTercerBloque;
/*
 * Pedir un número y calcular su factorial.
 */

import java.util.Scanner;

public class Ejercicio12_3 {

	public static void main(String[] args) {
		int num;
		int resultado = 1;
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un número: ");
		num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			resultado *= i;
		}
		
		System.out.println("Factorial de "+num+" es: "+resultado);
		
	}

}

package ejerciciosTercerBloque;

import java.util.Scanner;

/*
 * Pide un número(que debe estar entre 0  10) y mostrar
 * la tabla de multiplicar de dicho número.
 */

public class Ejercicio16_3 {

	public static void main(String[] args) {
		int num;
		int resultado;
		
		@SuppressWarnings("resource")
		Scanner sc =  new Scanner(System.in);
		System.out.println("Digite un número: ");
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			resultado = num * i;
			System.out.println(num+" x "+i+" = "+resultado);
		}
	}

}

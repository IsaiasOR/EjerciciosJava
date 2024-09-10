package ejerciciosPrimerBloque;

import java.util.Scanner;

/*
 * Hacer un programa que calcule el cuadrado de una suma.
 * (a+b)" = a" + 2.a.b + b"
 */
public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int resultado;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite los número para realizar el cuadrado de una suma");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();
		
		resultado = (int)Math.pow(num1, 2) + 2*num1*num2 + (int)Math.pow(num2, 2);
	
		System.out.println("El resultado del cuadrado de la suma es: "+resultado);
	}

}

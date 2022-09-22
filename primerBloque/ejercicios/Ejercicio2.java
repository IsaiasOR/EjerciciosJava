package ejercicios;

import java.util.Scanner;

/*
 * Hacer un programa que calcule e imprima el salario a partir
 * de sus horas semanales trabajadas y de su salario por hora.
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		float horasST;
		float salarioXhr = 150;
		float salario;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite las horas semanales trabajadas: ");
		horasST = entrada.nextFloat();
		
		salario  = horasST * salarioXhr;
		
		System.out.println("El salario es: "+salario);
	}

}

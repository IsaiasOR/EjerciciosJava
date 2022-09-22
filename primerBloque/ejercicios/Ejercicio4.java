package ejercicios;

import java.util.Scanner;

/*
 * Una compañia de venta de carros usados, paga a su personal
 * de ventas un salario de $1000 mensuales, más una comisión
 * de $150 por cada carro vendido, más el 5% del valor de la
 * venta por carro. Cada mes el capturista de la empresa
 * ingresa en la computadora los datos pertinentes.
 * Hacer un programa que calcule e imprima el salario mensual
 * de un vendedor dado.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		float salarioTotal;
		float salarioM = 1000;
		float comision = 150;
		float valorCarro;
		float porcent;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el valor de la venta del carro: ");
		valorCarro = entrada.nextFloat();
		
		porcent = valorCarro * 5 / 100;
		
		salarioTotal = salarioM + comision + porcent;
		
		System.out.println("El salario mensual del vendedor es de: "+salarioTotal);
	}

}

package ejerciciosPrimerBloque;

import java.util.Scanner;

/*
 * Construir un programa que, dado un número total de horas,
 * devuelve el número de semanas, días y horas equivalentes.
 * Por ejemplo, dado un total de 1000 horas debe mostrar 
 * 5 semanas, 6 días y 16 horas.
 */

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int horasTotales;
		int semanas;
		int dias;
		int horas;
		
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite el total de horas: ");
		horasTotales = entrada.nextInt();
		
		semanas = horasTotales / (24 * 7);
		dias = horasTotales % 168 / 24;
		horas = horasTotales % 24;
		
		System.out.println("El equivalente es: ");
		System.out.println("Semanas: "+semanas);
		System.out.println("Días: "+dias);
		System.out.println("Horas: "+horas);
	}

}

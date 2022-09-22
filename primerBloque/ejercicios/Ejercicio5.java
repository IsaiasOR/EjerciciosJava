package ejercicios;

import java.util.Scanner;

/*
 * La calificación final de un estudiante de informática
 * se calcula con base a las calificaciones de cuatro
 * aspectos de su rendimiento académico:
 * participación, primer examen parcial, segundo examen
 * parcial y examen final. Sabiendo que las calificaciones
 * anteriores entran en la calificación final con 
 * ponderaciones del 10%, 25%, 25% y 40%.
 * Hacer un programa que calcule e imprima la calificación
 * final obtenida por un estudiante.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		float participacion; 
		float primerExamen; 
		float segundoExamen; 
		float examenFinal;
		float calificacionF;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la calificación según su participación: ");
		participacion = entrada.nextFloat();
		
		System.out.println("Digite la calificación del primer examen parcial: ");
		primerExamen = entrada.nextFloat();
		
		System.out.println("Digite la calificación del segundo examen parcial: ");
		segundoExamen = entrada.nextFloat();
		
		System.out.println("Digite la calificación del examen final: ");
		examenFinal = entrada.nextFloat();
		
		participacion *= 0.10;
		primerExamen *= 0.25;
		segundoExamen *= 0.25;
		examenFinal *=  0.40;
		
		calificacionF = participacion + primerExamen + segundoExamen + examenFinal;
		
		System.out.println("La calificación final del estudiantes es: "+calificacionF);
	}

}

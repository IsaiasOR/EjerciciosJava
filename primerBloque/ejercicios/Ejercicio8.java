package ejercicios;

import java.util.Scanner;

/*
 * Construir un programa que calcule y muestre por pantalla 
 * las raíces de la ecuacuón de segundo grado de coeficientes 
 * reales.
 */
public class Ejercicio8 {

	public static void main(String[] args) {
		
		float a;
		float b;
		float c;
		float raiz1;
		float raiz2;
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite la ecuación de segundo grado número por número: ");
		System.out.println("a = ");
		a = entrada.nextFloat();
		System.out.println("b = ");
		b = entrada.nextFloat();
		System.out.println("c = ");
		c = entrada.nextFloat();
		
		
		raiz1 = (-b + (float)Math.sqrt(b*b - (4*a*c))) / (2*a);
		raiz2 = (-b - (float)Math.sqrt(b*b - (4*a*c))) / (2*a);
		
		System.out.println("Las raíces de la ecuación son: ");
		System.out.println("Raíz1: "+raiz1);
		System.out.println("Raíz2: "+raiz2);
	}

}

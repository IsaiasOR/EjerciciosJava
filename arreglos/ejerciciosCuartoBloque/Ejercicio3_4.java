package ejerciciosCuartoBloque;

import java.util.Scanner;

/*
 *Ejercicio 3: Leer 5 números por teclado, almacenarlos en un arreglo 
 *y a continuación realizar la media de los números positivos, 
 *la media de los negativos y conteo el número de ceros. 
 */

public class Ejercicio3_4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		float numeros[] = new float[5];
		
		float sumaPos = 0;
		int conteoPos = 0;
		
		float sumaNeg = 0;
		int conteoNeg = 0;
		
		int conteoCeros = 0;
		
		float mediaPos;
		float mediaNeg;
		
		System.out.println("Guardar los números en el arreglo");
		for(int i=0; i<5; i++) {
			System.out.print(i+1+". Digite un número: ");
			numeros[i] = entrada.nextFloat();
			
			if(numeros[i] == 0) {
				conteoCeros++;
			} else if(numeros[i] > 0) {
				sumaPos += numeros[i];
				conteoPos++;
			} else {
				sumaNeg += numeros[i];
				conteoNeg++;
			}
		}
		
		if(conteoPos == 0) {
			System.out.println("No se puede sacar la media de los números positivos");
		} else {
			mediaPos = sumaPos / conteoPos;
			System.out.println("La media de los números positivos es: "+ mediaPos);
		}
		
		if(conteoNeg == 0) {
			System.out.println("No se puede sacar la media de los números negativos");
		} else {
			mediaNeg = sumaNeg / conteoNeg;
			System.out.println("La media de los números negativos es: "+ mediaNeg);
		}
		
		System.out.println("La cantidad de ceros es: "+conteoCeros);
	}

}

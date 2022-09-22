package ejercicios;

import javax.swing.JOptionPane;

/*
 * Pedir 10 números. Mostrar la media de los números 
 * positivos, la media de los números negativos y la 
 * cantidad de ceros.
 */

public class Ejercicio13_3 {

	public static void main(String[] args) {
		int numero;
		int sPositivos = 0;
		int conteoPosit = 0;
		int sNegativos = 0;
		int conteoNegat = 0;
		int conteoCeros = 0;
		
		float mediaPosit;
		float mediaNegat;
		
		for(int i=1; i<=10; i++) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
			if (numero == 0) {
				conteoCeros++;
			} else if(numero > 0) {
				sPositivos += numero;
				conteoPosit++;
			} else {
				sNegativos += numero;
				conteoNegat++;
			}
		}
		
		if(conteoPosit == 0) {
			System.out.println("No se sacar la media de los positivos");
		} else {
			mediaPosit = (float) sPositivos/conteoPosit;
			System.out.println("La media de los positivos es: "+mediaPosit);
		}
		
		if(conteoNegat == 0) {
			System.out.println("No se sacar la media de los negativos");
		} else {
			mediaNegat = (float) sNegativos/conteoNegat;
			System.out.println("La media de los negativos es: "+mediaNegat);
		}
		
		System.out.println("La cantidad de ceros es: "+conteoCeros);
	}

}

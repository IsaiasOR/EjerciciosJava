package ejerciciosTercerBloque;
/*
 * Pedir números hasta que se introduzca 
 * uno negativo, y calcular la media.
 */

import javax.swing.JOptionPane;

public class Ejercicio7_3 {

	public static void main(String[] args) {
		double numero;
		int contador = 0;
		double suma = 0;
		float media;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		
		while(numero >= 0) {
			suma += numero;
			contador++;
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		}
		
		if(contador == 0) {
			System.out.println("Error! La división entre 0 es indefinida");
		} else {
			media = (float)suma / contador;
			System.out.println("La media de la suma de los números introducidos es: "+media);
		}
	}

}

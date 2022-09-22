package ejercicios;

import javax.swing.JOptionPane;

/*
 * Leer números hasta que se introduzca un 0. 
 * Para cada uno indicar si es par o impar.
 */

public class Ejercicio3_3 {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		while(numero != 0) {
			if(numero % 2 == 0) {
				System.out.println("El número "+numero+" es par");
			} else {
				System.out.println("El número "+numero+" es impar");
			}
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		}
	}

}

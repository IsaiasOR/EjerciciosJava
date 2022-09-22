package ejercicios;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que lea un número entero y muestre si 
 * el número es múltiplo de 10.
 */

public class Ejercicio1_2 {

	public static void main(String[] args) {
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		if (numero % 10 == 0 ) {
			JOptionPane.showMessageDialog(null, "El número "+numero+" es múltiplo de 10");
		}
		else {
			JOptionPane.showMessageDialog(null, "El número "+numero+" NO es múltiplo de 10");
		}
		
	}

}

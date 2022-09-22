package ejercicios;

import javax.swing.JOptionPane;

/*
 * Leer un número e indicar si es positivo o negativo.
 * El proceso se repetirá hasta que se introduzca un 0.
 */

public class Ejercicio2_3 {

	public static void main(String[] args) {
		int num;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		
		while(num > 0 || num < 0) {
			if(num > 0) {
				JOptionPane.showMessageDialog(null, "El número "+num+" es positivo");
			} else {
				JOptionPane.showMessageDialog(null, "El número "+num+" es negativo");
			}
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		}
	}

}

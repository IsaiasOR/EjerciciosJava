package ejercicios;
/*
 * Pedir dos números y decir cual es el mayor o si son iguales.
 */

import javax.swing.JOptionPane;

public class Ejercicio2_2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
		
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "Los números "+num1+" y "+num2+" son iguales");
		} 
		else {
			if(num1 > num2) {
				JOptionPane.showMessageDialog(null, "El número "+num1+" es mayor que el número "+num2);
			}
			else {
				JOptionPane.showMessageDialog(null, "El número "+num2+" es mayor que el número "+num1);
			}
		}
	
	}

}

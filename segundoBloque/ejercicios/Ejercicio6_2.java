package ejercicios;

import javax.swing.JOptionPane;

/*
 * Hacer un programa que tome dos números y diga
 * si ambos son pares o impares.
 */

public class Ejercicio6_2 {

	public static int digitalizarNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
		return num;
	}

	public static void parOImpar(int num1, int num2) {
		if (num1 % 2 == 0 && num2 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Los números: " + num1 + " y " + num2 + " son pares");
		} else {
			if (num1 % 2 != 0 && num2 % 2 != 0) {
				JOptionPane.showMessageDialog(null, "Los números: " + num1 + " y " + num2 + " son impares");
			} else {
				if (num1 % 2 == 0 && num2 % 2 != 0) {
					JOptionPane.showMessageDialog(null,
							"El número: " + num1 + " es par y el número " + num2 + " es impar");
				} else {
					JOptionPane.showMessageDialog(null,
							"El número: " + num1 + " es impar y el número " + num2 + " es par");
				}
			}
		}
	}

	public static void main(String[] args) {
		int num1 = digitalizarNum();
		int num2 = digitalizarNum();

		parOImpar(num1, num2);
	}

}

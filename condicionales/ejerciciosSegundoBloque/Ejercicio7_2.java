package ejerciciosSegundoBloque;

import javax.swing.JOptionPane;

/*
 * Pedir tres números y mostrarlos ordenados de mayor a
 * menor.
 */

public class Ejercicio7_2 {
	
	public static int pedirNum() {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		return num;
	}
	
	public static void ordenarNum(int num1, int num2, int num3) {
		if ((num1 > num2) && (num2 > num3)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num1 + " " + num2 + " " + num3);
		} 
		if ((num1 > num3) && (num3 > num2)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num1 + " " + num3 + " " + num2);
		}
		if ((num2 > num1) && (num1 > num3)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num2 + " " + num1 + " " + num3);
		}
		if ((num2 > num3) && (num3 > num1)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num2 + " " + num3 + " " + num1);
		}
		if ((num3 > num1) && (num1 > num2)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num3 + " " + num1 + " " + num2);
		}
		if ((num3 > num2) && (num2 > num1)) {
			JOptionPane.showMessageDialog(null, "El orden de los númos es de: "+ num3 + " " + num2 + " " + num1);
		}
	}

	
	public static void main(String[] args) {
		int n1 = pedirNum();
		int n2 = pedirNum();
		int n3 = pedirNum();
		ordenarNum(n1, n2, n3);
	}

}
